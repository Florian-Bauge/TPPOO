package Florian.TP3.controller;

import Florian.TP3.model.AddressRepository;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.HttpURLConnection;

@Controller
public class MeteoController {
    @Autowired
     AddressRepository addressRepository;
    RestTemplate restTemplate=new RestTemplate();
    @PostMapping ("/meteo")
    public String meteo(@RequestParam(name="adresse", required=false, defaultValue="World") String
                                   adresse, Model model) throws JSONException {
        model.addAttribute("nomTemplate", adresse);
        String trueAdresse= restTemplate.getForObject("http://api-adresse.data.gouv.fr/search/?q="+adresse+"&limit=1",String.class);
        JSONObject jsonpObject =new JSONObject(trueAdresse);
        JSONObject properties= jsonpObject.getJSONArray("features").getJSONObject(0).getJSONObject("properties");
        model.addAttribute("adresseTrue",properties.getString("label"));
        String citycode=properties.getString("citycode");
        String meteo=restTemplate.getForObject("https://api.meteo-concept.com/api/forecast/daily?token=aa2b3971e787dd53f34d4480f58e581dcaa864d6fca27439e64b87474b2f67b7&insee="+citycode,String.class);
        JSONObject jsonObject1=new JSONObject(meteo);
        JSONObject forecat=jsonObject1.getJSONArray("forecast").getJSONObject(0);
        model.addAttribute("tmin",forecat.getDouble("tmin"));
        model.addAttribute("tmax",forecat.getDouble("tmax"));


        return "meteo";
    }



}