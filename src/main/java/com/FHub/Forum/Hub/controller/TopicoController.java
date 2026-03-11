package com.FHub.Forum.Hub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FHub.Forum.Hub.domain.Topico;
import com.FHub.Forum.Hub.domain.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    private final TopicoRepository repository;
    public TopicoController(TopicoRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public List<Topico> listar(){
        return repository.findAll();
    }
}