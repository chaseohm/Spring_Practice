package com.codeup.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class  RollDice{
    @GetMapping("/roll-dice")
    public String rollPage () {
        return "roll-dice";
    }
    @GetMapping("/roll-dice/{guess}")
            public String rollResult(@PathVariable int guess, Model model){
                int random = (int) Math.ceil(Math.random() * 6);
                model.addAttribute("random", random);
                model.addAttribute("guess", guess);
                 boolean answer = false;
                if (random == guess){
                     answer = true;
                }
                 model.addAttribute("answer",answer);
                return "result";
            }


    }