package com.example.miprimerproyectospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MiPrimerProyectoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiPrimerProyectoSpringApplication.class, args);
    }
    @GetMapping
    public String saludar() {
        return "hola mundo";
    }
}