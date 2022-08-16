package com.sandwich.controller;

import com.sandwich.model.Spices;
import com.sandwich.service.ISpicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SandWichController {
    @Autowired
    private ISpicesService service;


    @GetMapping("/")
    public String spices(Model model) {
        List<Spices> list = service.spicesList();
        model.addAttribute("list", list);
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam String spices, Model model) {
        String result = spices;
        model.addAttribute("result", result);
        return "index";
    }

}
