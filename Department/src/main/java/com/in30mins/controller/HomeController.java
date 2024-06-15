package com.in30mins.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    //    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String home(){
        return welcomeMessage;
    }
}
