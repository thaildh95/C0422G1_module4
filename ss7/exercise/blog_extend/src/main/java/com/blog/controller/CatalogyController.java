package com.blog.controller;

import com.blog.service.ICatalogyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogyController {

    @Autowired
    private ICatalogyService catalogyService;

    @GetMapping("catalogy")
    public String goCatalogy(Model model)
    {
//        model.addAttribute("catalogyList",catalogyService.findAll());
        return "/catalogy";
    }

}
