package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/aluno")
public class DadosController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public DadosController() {
        alunos.add(new Aluno("Carlos", "Socio", 7,8));
        alunos.add(new Aluno("Nanami", "Jujutsu", 8,9));
        alunos.add(new Aluno("Laura", "SO", 4,9));
    }

    @GetMapping
    public List<Aluno> getAlunos()
    {
        return alunos;
    }
}
