package Florian.TP3.controller;

import Florian.TP3.model.Address;
import Florian.TP3.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddresseController {
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/addresse")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresse";
    }


}
