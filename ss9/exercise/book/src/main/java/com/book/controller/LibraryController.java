package com.book.controller;

import com.book.model.Library;
import com.book.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String borrow(Model model,@RequestParam int id) throws Exception {
        Library libraries = service.findById(id);
        if (libraries==null){
            throw new Exception();
        }
        if (libraries.getCount()<=0){
            model.addAttribute("mess","Hết sách rồi");
            return "detail";
        }
        libraries.setCount(libraries.getCount()-1);
        service.save(libraries);
        return "redirect:/";
    }
    @GetMapping("/pay")
    public String goPay(){
        return "/pay";
    }

    @PostMapping("/pay")
    public String pay(Model model,@RequestParam int id) throws Exception {
        Library libraries = service.findById(id);
      if (libraries == null){
          throw  new Exception();
      }
      if (libraries.getCount() == libraries.getTotal()){
          model.addAttribute("mess","số sách đã đủ");
          return "pay";
      }
        libraries.setCount(libraries.getCount()+1);
        service.save(libraries);
        model.addAttribute("mess","trả thành công");
        return "redirect:/home";
    }
    @ExceptionHandler(value =  Exception.class)
    public String errors(){
        return "errors";
    }
}
