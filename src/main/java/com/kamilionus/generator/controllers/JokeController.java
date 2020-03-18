package com.kamilionus.generator.controllers;

import com.kamilionus.generator.services.IJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private IJokeService jokeService;

    public JokeController(IJokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return  "chucknorris";
    }
}
