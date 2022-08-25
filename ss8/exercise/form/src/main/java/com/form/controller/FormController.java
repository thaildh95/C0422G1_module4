package com.form.controller;

import com.form.dto.FormDto;
import com.form.model.Form;
import com.form.service.IFormService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class FormController {
    @Autowired
    private IFormService service;

    @GetMapping("/")
    public String goForm(Model model) {
        model.addAttribute("formDto", new FormDto());
        return "form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Valid FormDto formDto,
                         BindingResult bindingResult) {

        new FormDto().validate(formDto, bindingResult);
        if (formDto.getAge() == null) {
            return "form";
        }
        if (bindingResult.hasErrors()) {
            return "form";
        }

        Form form = new Form();
        BeanUtils.copyProperties(formDto, form);

        this.service.save(form);

        return "redirect:/list";
    }

    @GetMapping("/list")
    public String goList(@PageableDefault(value = 4) Pageable pageable,
                         @RequestParam Optional<String> firstName,
                         Model model) {

        String firstNameValue = firstName.orElse("");
        model.addAttribute("mess", "Register Success");
        model.addAttribute("formList", service.findAllByFirstName(firstNameValue, pageable));
        model.addAttribute("firstNameValue", firstNameValue);
        return "/list";
    }

}
