package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/index", "/", "/home"})
    public String index(Model mv) {
        mv.addAttribute("titulo", "Hola Spring Boot Framework con Model");
        return "index";
    }

}
