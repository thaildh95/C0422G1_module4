//package com.casestudy.controller;
//
//import com.casestudy.model.person.customer.Customer;
//import com.casestudy.service.ICustomerService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import javax.validation.Valid;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/customer")
//public class
//CustomerController {
//    @Autowired
//    private ICustomerService service;
//    @Autowired
//
//    @GetMapping("")
//    public  String goCustomerList(@PageableDefault(value = 4) Pageable pageable,
//            @RequestParam Optional<String> name,
//            Model model){
//        for(Sort.Order order : pageable.getSort()){
//            model.addAttribute("sortValue",order.getProperty());
//        }
//
//        String nameValue = name.orElse("");
//        model.addAttribute("nameValue", nameValue);
//        model.addAttribute("customerList", service.findAllByName(nameValue,pageable));
//        return "/customer/list";
//    }
//    @PostMapping("/delete")
//    public String deleteCustomer(@RequestParam Integer id, Model model){
//        service.delete(id);
//        model.addAttribute("msg", "Xóa thành công");
//        return "redirect:/customer";
//    }
//    @GetMapping("/add")
//    public String goAdd(Model model){
//        model.addAttribute("typeCustomer", this.typeService.typeList());
//        model.addAttribute("customerDto", new CustomerDto());
//        return "/customer/add";
//    }
//    @PostMapping("/add")
//    public String add(@ModelAttribute
//                          @Valid CustomerDto customerDto,
//                        BindingResult bindingResult,
//                        RedirectAttributes redirectAttributes,
//                        Model model){
//        new CustomerDto().validate(customerDto, bindingResult);
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("typeCustomer", typeService.typeList());
//            return "customer/add";
//        }
//        Customer customer = new Customer();
//        BeanUtils.copyProperties(customerDto, customer);
//        model.addAttribute("customerDto", customerDto);
//        service.save(customer);
//        redirectAttributes.addFlashAttribute("msg", "Register successfully!");
//        return "redirect:/customer";
//    }
//    @GetMapping("/edit")
//    public String goEdit(Model model,@RequestParam Integer id){
//
//        model.addAttribute("typeCustomer", typeService.typeList());
//        model.addAttribute("customerDto",service.findById(id));
//        return "/customer/edit";
//    }
//    @PostMapping("/edit")
//    public String updateCustomer(@ModelAttribute
//                                 @Valid CustomerDto customerDto,
//                                 BindingResult bindingResult,
//                                 RedirectAttributes redirectAttributes,
//                                 Customer customer, Model model) {
//        new CustomerDto().validate(customerDto, bindingResult);
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("typeCustomers", typeService.typeList());
//
//            return "customer/edit";
//        }
//        service.save(customer);
//        redirectAttributes.addFlashAttribute("msg1", "Update successfully!");
//        return "redirect:/customer";
//    }
//}
