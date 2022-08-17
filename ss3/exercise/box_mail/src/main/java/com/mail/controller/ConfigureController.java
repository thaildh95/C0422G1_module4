package com.mail.controller;

import com.mail.model.MailConfiguration;
import com.mail.service.IMailConfigureService;
import com.mail.service.impl.MailConfigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ConfigureController {
    @Autowired
    IMailConfigureService service;

    @GetMapping("/")
    public String goIndex(Model model) {
        List<String> languageList = service.showAllLanguage();
        List<Integer> sizeList = service.showAllSize();
        model.addAttribute("MailConfiguration", new MailConfiguration());
        model.addAttribute("languageList", languageList);
        model.addAttribute("sizeList", sizeList);
        return "index";
    }

    @PostMapping("/configure")
    public String configure(@ModelAttribute("configure") MailConfiguration mailConfiguration,
                            RedirectAttributes redirectAttributes, Model model) {
        List<MailConfiguration> mailConfigurations;
        mailConfigurations = service.save(mailConfiguration);
        model.addAttribute("configureList", mailConfigurations);
        redirectAttributes.addFlashAttribute("msg", "configure success");
        return "list";
    }
}
