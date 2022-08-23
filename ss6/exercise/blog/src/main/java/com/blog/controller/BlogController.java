package com.blog.controller;

import com.blog.model.Blog;
import com.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    @Autowired
    private IBlogService service;


    @GetMapping("/")
    public String goHome(Model model) {
        model.addAttribute("blogList", service.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("blog", new Blog());
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
