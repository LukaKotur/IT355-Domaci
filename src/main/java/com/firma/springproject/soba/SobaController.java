/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firma.springproject.soba;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.firma.springproject.soba.SobaDAO;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Luka
 */
@Controller
public class SobaController {

    @Autowired
    SobaService sobaService;
    @Autowired
    SobaDAO sobaDAO;

    @RequestMapping(value = "/sobe", method = RequestMethod.GET)
    public ModelAndView students(ModelAndView modelAndView) {
        List<Soba> sobe = sobaService.getAllSobe();
        modelAndView.addObject("sobe", sobe);
        modelAndView.setViewName("sobe");
        return modelAndView;
    }
   
    @RequestMapping(value = "/addSoba", method = RequestMethod.GET)
    public ModelAndView newSoba(ModelAndView model) {
        Soba soba = new Soba();
        model.addObject("soba", soba);
        model.setViewName("Forma");
        return model;
    }

    @RequestMapping(value = "/saveSoba", method = RequestMethod.POST)
    public ModelAndView saveSoba(@ModelAttribute Soba soba) {
        sobaDAO.addOrUpdateSoba(soba);
        return new ModelAndView("redirect:/sobe");
    }

    @RequestMapping(value = "/editSoba", method = RequestMethod.GET)
    public ModelAndView editSoba(HttpServletRequest request) {
        int sobaId = Integer.parseInt(request.getParameter("sobaId"));
        Soba soba = sobaDAO.getSoba(sobaId);
        ModelAndView model = new ModelAndView("Forma");
        model.addObject("soba", soba);
        return model;
    }

    @RequestMapping(value = "/deleteSoba", method = RequestMethod.GET)
    public ModelAndView deleteSoba(HttpServletRequest request) {
        int sobaId = Integer.parseInt(request.getParameter("sobaId"));
        System.out.println("broj je: " + sobaId);
        sobaDAO.deleteSoba(sobaId);
        return new ModelAndView("redirect:/sobe");
    }

}
