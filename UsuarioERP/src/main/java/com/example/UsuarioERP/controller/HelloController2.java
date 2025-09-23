package com.example.UsuarioERP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testeHello")

public class HelloController2 {

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
