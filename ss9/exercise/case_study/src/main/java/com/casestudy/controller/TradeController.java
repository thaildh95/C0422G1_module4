package com.casestudy.controller;

import com.casestudy.model.person.customer.Customer;
import com.casestudy.model.person.customer.TradeInfo;
import com.casestudy.service.ICustomerService;
import com.casestudy.service.ITradeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class TradeController {
    @Autowired
    private ITradeService tradeService;

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public  String goCustomerList(@PageableDefault(value = 4) Pageable pageable,
                                  @RequestParam Optional<String> name,
                                  Model model){
        for(Sort.Order order : pageable.getSort()){
            model.addAttribute("sortValue",order.getProperty());
        }

        String nameValue = name.orElse("");
        model.addAttribute("nameValue", nameValue);
        model.addAttribute("tradeList", tradeService.tradeInfo(nameValue,pageable));
        return "/customer/list";
    }

    @GetMapping("/add")
    public String goAdd(Model model){
        model.addAttribute("customerList",customerService.findAll());
        model.addAttribute("trade", new TradeInfo());
        return "/customer/add";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute TradeInfo tradeInfo,
                      RedirectAttributes redirectAttributes,
                      Model model){

        tradeService.save(tradeInfo);
        redirectAttributes.addFlashAttribute("msg", "Register successfully!");
        return "redirect:/customer";
    }
    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam Integer id, Model model){
        tradeService.delete(id);
        model.addAttribute("msg", "Xóa thành công");
        return "redirect:/";
    }
}
