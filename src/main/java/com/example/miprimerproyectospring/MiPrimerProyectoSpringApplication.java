package com.example.miprimerproyectospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class MiPrimerProyectoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiPrimerProyectoSpringApplication.class, args);
    }
    @GetMapping(path = "api/tati")
    public String saludar() {
        return "hola tati";
    }

    @GetMapping
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping(path = "saludos")
    public List<String> saludos(){
        return List.of("hola", "chao","buenas tardes","buenos dias");
    }
}