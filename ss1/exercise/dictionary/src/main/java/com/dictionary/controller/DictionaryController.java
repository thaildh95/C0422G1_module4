package com.dictionary.controller;

import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService dictionaryService;


    @GetMapping("/")
    public String Diction(){
        return "/dictionary";

    }
    @PostMapping("/dictionarytion")
    public String dictionary(@RequestParam String name , Model model ){
        String result = dictionaryService.findWord(name);
        model.addAttribute("result",result);
        return "dictionary";
    }
}
