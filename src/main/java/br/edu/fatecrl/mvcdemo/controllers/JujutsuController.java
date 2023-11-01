package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.JujutsuKaisen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jujutsu")
public class JujutsuController {

    private static final List<JujutsuKaisen> jujutsu = new ArrayList<JujutsuKaisen>();

    public JujutsuController() {
        jujutsu.add(new JujutsuKaisen("Satoru Gojo", "Clã Amanki", 15000));
        jujutsu.add(new JujutsuKaisen("Fushiguro", "Clã Unumaki", 6700));
        jujutsu.add(new JujutsuKaisen("Aoi Todo", "Clã Kamato", 9040));
    }

    @GetMapping
    public String getJujutsu(Model model) {
        model.addAttribute("jujutsu", jujutsu);
        return "jujutsu";


    }
}