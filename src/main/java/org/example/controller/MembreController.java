package org.example.controller;

import org.example.model.Membre;
import org.example.services.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


@Controller

public class MembreController {


    private MembreService membreService;

    public MembreController(MembreService membreService){
        this.membreService = membreService;
    }


    @GetMapping("/save")
    public String index(Model model) {
        model.addAttribute("membre", new Membre());
        return "addMembre";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("membre") Membre membre) {
        membreService.save(membre);
        return "redirect:/";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Membre> list = membreService.findAll();
        model.addAttribute("list", list);
        Membre mebre = membreService.findByFirstname("Talon");
        model.addAttribute("mebre", mebre);
        return "listMembre";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        membreService.deleteById(id);
        return "redirect:/";
    }



}
