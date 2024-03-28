package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SerieController {
    @Autowired
    private SerieRepository repository;

    @GetMapping("/series")
    private String teste(){
        return  "teste";
    }

    @GetMapping("/**")
    private String notfound(){
        return "notfound";
    }
}
