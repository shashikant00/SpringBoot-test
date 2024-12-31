package com.jlcindia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/show")
    public String msg(){
       return  "Welcome to Springboot project";
    }

    @GetMapping("/msg")
    public String showWishMessage(){
        return "I am happy to see you!";
    }
}
