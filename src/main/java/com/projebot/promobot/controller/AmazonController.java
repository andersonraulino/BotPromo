package com.projebot.promobot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonController {

    @GetMapping("/buscar")
    public String buscar() {
        return "Funcionando 🔥";
    }
}