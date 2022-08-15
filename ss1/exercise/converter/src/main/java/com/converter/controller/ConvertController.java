package com.converter.controller;

import com.converter.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @Autowired
    private IConvertService convertService;
    @GetMapping("/")
    public String convertion(){
        return "convert";
    }

    @PostMapping("/convertUSD")
    public String converter(@RequestParam double usd , Model model){
      double resultChangeUSD = convertService.convert(usd);
      model.addAttribute("resultChangeUSD",resultChangeUSD);
      return "convert";
    }


}
