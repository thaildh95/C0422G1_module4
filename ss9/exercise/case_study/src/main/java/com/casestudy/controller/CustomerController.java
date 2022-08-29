package com.casestudy.controller;

import com.casestudy.model.person.customer.Customer;
import com.casestudy.service.ICustomerService;
import com.casestudy.service.ICustomerTypeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @Autowired
    private ICustomerTypeService typeService;

    @GetMapping("")
    public  String goCustomerList(@PageableDefault(value = 4) Pageable pageable,
            @RequestParam Optional<String> name,
            Model model){
        for(Sort.Order order : pageable.getSort()){
            model.addAttribute("sortValue",order.getProperty());
        }

        String nameValue = name.orElse("");
        model.addAttribute("nameValue", nameValue);
        model.addAttribute("customerList", service.findAllByName(nameValue,pageable));
        return "/customer/list";
    }
    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam Integer id, Model model){
        service.delete(id);
        model.addAttribute("msg", "Xóa thành công");
        return "redirect:/customer/";
    }
    @GetMapping("/add")
    public String goAdd(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("typeCustomer",typeService.typeList());
        return "/customer/add";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute("customer") Customer customer,
                        Model model){
        service.save(customer);
        model.addAttribute("msg","thêm mới thành công");
        return "redirect:/customer/";
    }
    @GetMapping("/edit")
    public String goEdit(Model model,@RequestParam Integer id){
        model.addAttribute("customer",service.findById(id));
        model.addAttribute("typeCustomer",typeService.typeList());
        return "/customer/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute("customer") Customer customer, Model model){
        service.save(customer);
        model.addAttribute("msg", "sửa thành công");
        return "redirect:/customer/";
    }
}
