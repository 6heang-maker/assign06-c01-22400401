package org.example.week06_javacrud1.controller;

import org.example.week06_javacrud1.dto.GameRequest;
import org.example.week06_javacrud1.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GameWebController {

    private final GameService gameService;

    public GameWebController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public String list(Model model) {
        model.addAttribute("games", gameService.findAll());
        return "games/list";
    }

    @GetMapping("/games/new")
    public String form() {
        return "games/form";
    }

    @PostMapping("/games")
    public String create(@ModelAttribute GameRequest request) {
        gameService.create(request);
        return "redirect:/games";
    }
}