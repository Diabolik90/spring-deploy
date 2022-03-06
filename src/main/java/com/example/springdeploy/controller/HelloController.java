package com.example.springdeploy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;

    /**
     * Mensaje Hola mundo
     * http://localhost:8081/hola
     * @return
     */
    @GetMapping("/hola")
    public String holamundo(){
        return "¡Hola mundo! Diabolik te saluda." + message;
    }

}
