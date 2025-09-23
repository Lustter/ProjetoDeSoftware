package com.example.UsuarioERP.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")

public class SuporteController {

    @PostMapping
    public void cadastrarMensagem(@RequestBody String usuario) {
        System.out.println(usuario);
    }

}
