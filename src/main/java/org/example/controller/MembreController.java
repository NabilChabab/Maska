package org.example.controller;

import org.example.model.Membre;
import org.example.services.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


@Controller
public class MembreController {



    @Autowired
    private MembreService membreService;


    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("membre", new Membre());
        return "addMembre";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("membre") Membre membre) {
        membreService.save(membre);
        return "redirect:/index";
    }


}
