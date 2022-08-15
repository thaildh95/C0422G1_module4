package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting(){
        return "/greeting" ;
    }
    @PostMapping("/greeting")
    public String greeting(@RequestParam String input, Model model){
        String result = input;
        model.addAttribute("result",result);
        return "greeting";
    }
}
