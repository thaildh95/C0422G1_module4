package com.casestudy.controller;

import com.casestudy.dto.CustomerDto;
import com.casestudy.model.person.customer.Customer;
import com.casestudy.service.ICustomerService;
import com.casestudy.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class
CustomerController {
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
        return "redirect:/customer";
    }
    @GetMapping("/add")
    public String goAdd(Model model){
        model.addAttribute("customerDto",new CustomerDto());
        model.addAttribute("typeCustomer",typeService.typeList());
        return "/customer/add";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute @Valid CustomerDto customerDto,
                        BindingResult bindingResult,
                        RedirectAttributes redirectAttributes,
                        Model model){
        customerDto.validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("typeCustomer", this.typeService.typeList());
            if (customerDto.getId() == null) {
                model.addAttribute("mess", "Add failed");
                return "/customer/add";
            }
            model.addAttribute("mess", "Edit failed");
            return "/customer/edit";
        }

        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        if (customer.getCustomerId() == null) {
            this.service.save(customer);
            redirectAttributes.addFlashAttribute("mess", "Add successfully!");
            return "redirect:/customer";
        }
        redirectAttributes.addFlashAttribute("mess", "Edit successfully!");
        this.service.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/edit")
    public String goEdit(Model model,@RequestParam Integer id){

        model.addAttribute("customer",service.findById(id));
        model.addAttribute("typeCustomer",typeService.typeList());

        return "/customer/edit";
    }

}
