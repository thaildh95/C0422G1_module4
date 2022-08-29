package com.blog.controller;

import com.blog.model.Blog;
import com.blog.service.IBlogService;
import com.blog.service.ICatalogyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogService service;
    private ICatalogyService catalogyService;


    @GetMapping("/")
    public String goHome(Model model,
                         @PageableDefault(value = 3) Pageable pageable,
                         @RequestParam Optional<String> detail,
                         @RequestParam Optional<String> title

    ) {

        for (Sort.Order order : pageable.getSort()) {
            model.addAttribute("sortValue", order.getProperty());
        }

        String detailValue = detail.orElse("");
        String titleValue = title.orElse("");
        model.addAttribute("blogList", service.findAllByDetailAndTitle(detailValue, titleValue, pageable));
        model.addAttribute("detailValue", detailValue);
        model.addAttribute("titleValue", titleValue);
//        model.addAttribute("catalogyList",catalogyService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("blog", new Blog());
//        model.addAttribute("catalogyList",catalogyService.findAll());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog) {
        service.save(blog);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(Model model, @RequestParam int id) {
        model.addAttribute("blog", service.findById(id));
        return "/update";

    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id) {
        service.delete(id);
        return "redirect:/";
    }


}
