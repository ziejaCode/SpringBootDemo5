package com.ziejacode.JokeApp1.controllers;

import com.ziejacode.JokeApp1.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {

        this.jokeService = jokeService;
    }
    
    @RequestMapping({"/",""})
    public String getJoke(Model model){
        System.out.println("test nr 245");
        model.addAttribute("joke", jokeService.getJoke());
        System.out.println("chuck works");
        return "chucknorris";
    }
}
