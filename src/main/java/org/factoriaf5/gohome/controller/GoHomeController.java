package org.factoriaf5.gohome.controller;

import org.factoriaf5.gohome.repositories.GoHome;
import org.factoriaf5.gohome.repositories.GoHomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GoHomeController {
    private GoHomeRepository goHomeRepository;

    @Autowired
    public GoHomeController(GoHomeRepository goHomeRepository) {
        this.goHomeRepository = goHomeRepository;
    }

    @GetMapping("/homes")
    String listHomes(Model model) {
        List<GoHome> homes = (List<GoHome>) goHomeRepository.findAll();
        model.addAttribute("title", "Lista de Casas");
        model.addAttribute("homes", homes);
        return "homes/all";
    }
}
