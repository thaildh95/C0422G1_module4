package com.casestudy.controller;

import com.casestudy.dto.CustomerDto;
import com.casestudy.dto.FacilityDto;
import com.casestudy.model.facility.Facility;
import com.casestudy.model.person.customer.Customer;
import com.casestudy.service.IFacilityService;
import com.casestudy.service.IRentalTypeService;
import com.casestudy.service.IServiceTypeService;
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
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IRentalTypeService rentalTypeService;

    @Autowired
    private IServiceTypeService typeService;

    @GetMapping("")
    public String goFacilityList(@PageableDefault(value = 4) Pageable pageable,
                                 @RequestParam Optional<String> name,
                                 Model model) {
        for (Sort.Order order : pageable.getSort()) {
            model.addAttribute("sortValue", order.getProperty());
        }

        String nameValue = name.orElse("");
        model.addAttribute("nameValue", nameValue);
        model.addAttribute("rentalType", rentalTypeService.findAll());
        model.addAttribute("serviceType", typeService.findAll());
        model.addAttribute("facilityList", facilityService.findAllByName(nameValue, pageable));

        return "/facility/list";
    }

    @PostMapping("/delete")
    public String deleteFacility(@RequestParam Integer id) {
        facilityService.delete(id);
        return "redirect:/facility";
    }

    @GetMapping("/add")
    public String goAdd(Model model) {
        model.addAttribute("facilityDto", new FacilityDto());
        model.addAttribute("rentalType", rentalTypeService.findAll());
        model.addAttribute("serviceType", typeService.findAll());
        return "/facility/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute
                      @Valid FacilityDto facilityDto,
                      BindingResult bindingResult,
                      RedirectAttributes redirectAttributes,
                      Model model) {

        new FacilityDto().validate(facilityDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("serviceType", typeService.findAll());
            model.addAttribute("rentalType", rentalTypeService.findAll());
            return "facility/add";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        model.addAttribute("facilityDto", facilityDto);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("msg", "Register successfully!");
        return "redirect:/facility";
    }

    @GetMapping("/edit")
    public String goEdit(Model model, @RequestParam Integer id) {
        model.addAttribute("facilityDto", facilityService.findById(id));
        model.addAttribute("rentalType", rentalTypeService.findAll());
        model.addAttribute("serviceType", typeService.findAll());

        return "/facility/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute
                           @Valid FacilityDto facilityDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        new FacilityDto().validate(facilityDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("serviceType", typeService.findAll());
            model.addAttribute("rentalType", rentalTypeService.findAll());
            return "facility/add";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        model.addAttribute("facilityDto", facilityDto);
        facilityService.save(facility);
        return "redirect:/facility";
    }
}
