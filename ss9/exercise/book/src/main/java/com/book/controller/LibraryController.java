package com.book.controller;

import com.book.model.Library;
import com.book.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {
    @Autowired
    private ILibraryService service;

    @GetMapping("/")
    public String goHome(Model model){
        model.addAttribute("bookList",service.findAll());
        return "/home";

    }
    @GetMapping("/detail")
    public String goDetail(Model model, @RequestParam int id){
        model.addAttribute("book",service.findById(id));
        return "/detail";
    }
    @PostMapping("/borrow")
    public String borrow(Model model,@RequestParam int id){
        Library libraries = service.findById(id);
        if (libraries.getCount()<=0){
            model.addAttribute("mess1","Hết sách rồi");
            return "detail";
        }
        libraries.setCount(libraries.getCount()-1);
        service.save(libraries);
        return "redirect:/";
    }

    @PostMapping("/pay")
    public String pay(Model model,@RequestParam int id){
        Library libraries = service.findById(id);
        if (libraries.getCount()>libraries.getTotal()){
            model.addAttribute("mess1","Quá số lượng sách trả");
            return "redirect:/";
        }
        libraries.setCount(libraries.getCount()+1);
        service.save(libraries);
        return "redirect:/";
    }
}
