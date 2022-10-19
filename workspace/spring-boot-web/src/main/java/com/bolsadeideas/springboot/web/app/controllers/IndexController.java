package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        usuario.setEmail("andy.gz@gmail.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping(value = "/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Lista de usuarios");
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = Arrays.asList(
            new Usuario("Andres", "Guzman", "andy.gz@gmail.com"),
            new Usuario("Ana", "Mercado", "ana.mec@gmail.com"),
            new Usuario("Julian", "Rosas", "jul.ros@gmail.com"),
            new Usuario("Tornado", "Mack", "tor.mack@gmail.com")
        );
        return usuarios;
    }

}
