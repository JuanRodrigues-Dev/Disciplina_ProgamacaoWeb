package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
    @GetMapping
    public String listar(){
        return "Listar Alunos";
    }

    @PostMapping
    public String cadastrar(){
        return "Cadastrar Aluno";
    }
}
