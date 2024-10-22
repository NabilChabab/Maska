package org.example.controller;

import org.example.model.Membre;
import org.example.services.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


@Controller
public class MembreController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index", "message", "Hello, Spring MVC!");
    }

}
