package br.com.bruno.spring_boot_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String saudacao(@RequestParam(name = "nome", defaultValue = "Bruno") String nome) {
        return String.format("Bem-vindo, %s", nome);
    }
}
