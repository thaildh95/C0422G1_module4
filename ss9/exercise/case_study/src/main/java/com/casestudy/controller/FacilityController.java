package com.casestudy.controller;

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
        model.addAttribute("facility", new FacilityDto());
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
            model.addAttribute("facilityTypeList", this.facilityService.findAll());
            model.addAttribute("rentTypeList", this.rentalTypeService.findAll());
            if (facilityDto.getFacilityId() == null) {
                model.addAttribute("mess", "Add field");
                return "/facility/add";
            }
            model.addAttribute("mess", "Edit field");
            return "/facility/edit";
        }

        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        this.facilityService.save(facility);
        if (facility.getFacilityId() == null) {
            redirectAttributes.addFlashAttribute("mess", "Add successfully!");
            return "redirect:/facility/add";
        }
        redirectAttributes.addFlashAttribute("mess", "Edit successfully!");
        return "redirect:/facility";
    }

    @GetMapping("/edit")
    public String goEdit(Model model, @RequestParam Integer id) {
        model.addAttribute("facility", facilityService.findById(id));
        model.addAttribute("rentalType", rentalTypeService.findAll());
        model.addAttribute("serviceType", typeService.findAll());

        return "/facility/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("facility") Facility facility, Model model) {
        facilityService.save(facility);
        model.addAttribute("msg", "sửa thành công");
        return "redirect:/facility";
    }
}
