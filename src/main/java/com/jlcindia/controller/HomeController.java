package com.jlcindia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/show")
    public String msg(){
       return  "Welcome to Springboot project";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello, How are you?";
    }
}
