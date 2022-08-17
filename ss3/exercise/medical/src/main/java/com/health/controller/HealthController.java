package com.health.controller;

import com.health.model.HealthDeclare;
import com.health.service.IHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HealthController {
    @Autowired
    private IHealthService service;

    @GetMapping("/")
    public String goIndex(Model model) {
        List<String> getDayList = service.listDay();
        List<String> getMonthList = service.listMonth();
        List<String> getYearList = service.listYear();
        List<String> getGenderList = service.genderList();
        List<String> getNationList = service.nationList();
        List<String> getVerhicleList = service.vehicle();

        model.addAttribute("dayList", getDayList);
        model.addAttribute("monthList", getMonthList);
        model.addAttribute("yearList", getYearList);
        model.addAttribute("genderList", getGenderList);
        model.addAttribute("nationList", getNationList);
        model.addAttribute("verhicleList", getVerhicleList);
        model.addAttribute("HealthDeclare", new HealthDeclare());

        return "index";

    }

    @PostMapping("/info")
    public String health(@ModelAttribute HealthDeclare healthDeclare,
                         Model model) {
        List<HealthDeclare> healthDeclareList;
        healthDeclareList = service.listDeclare(healthDeclare);
        model.addAttribute("healthDeclareList", healthDeclareList);
        return "info";
    }

    @GetMapping("/showEdit")
    public String edit(@RequestParam String id, Model model) {
        List<String> getDayList = service.listDay();
        List<String> getMonthList = service.listMonth();
        List<String> getYearList = service.listYear();
        List<String> getGenderList = service.genderList();
        List<String> getNationList = service.nationList();
        List<String> getVerhicleList = service.vehicle();
        HealthDeclare healthDeclare = service.searchById(id);
        model.addAttribute("dayList", getDayList);
        model.addAttribute("monthList", getMonthList);
        model.addAttribute("yearList", getYearList);
        model.addAttribute("genderList", getGenderList);
        model.addAttribute("nationList", getNationList);
        model.addAttribute("verhicleList", getVerhicleList);
        return "update";
    }

    @PostMapping("/showEdit")
    public String edit(@ModelAttribute("HealthDeclare") HealthDeclare healthDeclare, @RequestParam String id) {
        service.update(id, healthDeclare);
        return "index";
    }
}
