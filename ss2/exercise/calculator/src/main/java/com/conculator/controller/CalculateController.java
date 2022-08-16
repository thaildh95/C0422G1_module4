package com.conculator.controller;

import com.conculator.service.ICalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @Autowired
    private ICalculateService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/calculatate")
    public String calculate(@RequestParam double number1,
                            @RequestParam double number2,
                            @RequestParam String operator,
                            Model model) {
        String result = service.calculate(number1, number2, operator);
        model.addAttribute("result", result);
        return "index";
    }
}
