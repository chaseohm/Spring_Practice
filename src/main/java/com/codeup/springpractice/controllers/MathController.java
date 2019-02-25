package com.codeup.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping("/add/{number}/{secondnumber}")
    @ResponseBody
    public Integer add(@PathVariable int number, @PathVariable int secondnumber) {
        return (number + secondnumber);
    }
    @GetMapping("/subtract/{number}/{secondnumber}")
    @ResponseBody
    public Integer subtract(@PathVariable int number, @PathVariable int secondnumber){
        return (number - secondnumber);
    }
    @GetMapping("/multiply/{number}/{secondnumber}")
    @ResponseBody
    public Integer multiply(@PathVariable int number, @PathVariable int secondnumber){
        return (number * secondnumber);
    }
    @GetMapping("/divide/{number}/{secondnumber}")
    @ResponseBody
    public Integer divide(@PathVariable int number, @PathVariable int secondnumber){
        return (number / secondnumber);
    }
}