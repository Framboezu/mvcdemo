package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.JujutsuKaisen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jujutsu")
public class JujutsuDadosController {

    private static final List<JujutsuKaisen> jujutsu = new ArrayList<JujutsuKaisen>();

    public JujutsuDadosController() {
        jujutsu.add(new JujutsuKaisen("Satoru Gojo", "Clã Amanki", 15000));
        jujutsu.add(new JujutsuKaisen("Fushiguro", "Clã Unumaki", 6700));
        jujutsu.add(new JujutsuKaisen("Aoi Todo", "Clã Kamato", 9040));
    }

    @GetMapping
    public List<JujutsuKaisen> getJujutsu()
    {
        return jujutsu;
    }
}
