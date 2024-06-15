package com.in30mins.springboot_thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello-mama");
        return "helloworld";
    }

    @GetMapping("/style")
    public String style(){
        return "add-css-js";
    }
}
