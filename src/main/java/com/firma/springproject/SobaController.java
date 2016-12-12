/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firma.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Luka
 */
@Controller
public class SobaController {

    @RequestMapping(value = "/soba", method
            = RequestMethod.GET)
    public String student(ModelMap map) {
        map.addAttribute("soba", new Soba());
        return "unosSobe";
    }

    @RequestMapping(value = "/addSoba", method
            = RequestMethod.POST)
    public String addSoba(@ModelAttribute Soba soba,
            ModelMap model) {
        model.addAttribute("beds", soba.getNumberOfBeds());
        model.addAttribute("ac", soba.getAc());
        model.addAttribute("tv", soba.getTv());
        model.addAttribute("size", soba.getSize());
        model.addAttribute("bathroom", soba.getBathroom());
        model.addAttribute("price", soba.getPricePerDay());
        return "prikazSobe";
    }
}
