package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping(value = "/app")
public class IndexController {

    @GetMapping(value = {"","/index", "/", "/home"})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Spring Boot Framework con Model");
        return "index";
    }

    @RequestMapping(value = "/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();

        usuario.setNombre("Andres");
        usuario.setApellido("Gonzalez");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

}
