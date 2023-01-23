package Florian.TP3.controller;

import Florian.TP3.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {
    @Autowired
     AddressRepository addressRepository;
    @PostMapping("/meteo")
    public String meteo(@RequestParam(name="adresse", required=false, defaultValue="World") String
                                   adresse, Model model) {
        model.addAttribute("adresse", adresse);
        return "meteo";
    }

}