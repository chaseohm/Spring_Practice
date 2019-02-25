package com.codeup.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping("/add/{number}/{secondnumber}")
    @ResponseBody
    public String add(@PathVariable int number, @PathVariable int secondnumber) {
        return String.valueOf(number + secondnumber);
    }
    @GetMapping("/subtract/{number}/{secondnumber}")
    @ResponseBody
    public String subtract(@PathVariable int number, @PathVariable int secondnumber){
        return String.valueOf(number - secondnumber);
    }
    @GetMapping("/multiply/{number}/{secondnumber}")
    @ResponseBody
    public String multiply(@PathVariable int number, @PathVariable int secondnumber){
        return String.valueOf(number * secondnumber);
    }
    @GetMapping("/divide/{number}/{secondnumber}")
    @ResponseBody
    public double divide(@PathVariable double number, @PathVariable double secondnumber){
        return (number / secondnumber);
    }
}