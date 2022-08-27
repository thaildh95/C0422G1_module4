package com.casestudy.controller;

import com.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService service;

    @GetMapping("/customer")
    public String goList(@PageableDefault(value = 4) Pageable pageable,
                         @RequestParam Optional<String> name,
                         Model model){
        String nameValue = name.orElse("");
        model.addAttribute("customerList", service.findAllByName(nameValue,pageable));
        return "list";
    }

}
