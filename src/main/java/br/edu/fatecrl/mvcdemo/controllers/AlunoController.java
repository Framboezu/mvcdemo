package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoController() {
        alunos.add(new Aluno("João", "ENG", 7,8));
        alunos.add(new Aluno("Marcos", "Redes", 8,9));
        alunos.add(new Aluno("Luana", "POO", 4,9));
    }

    @GetMapping
    public String getAlunos(Model model) {
        model.addAttribute("alunos", alunos);
        return "alunos";


    }
}
