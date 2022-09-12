package com.casestudy.controller;

import com.casestudy.model.contract.AttachFacility;
import com.casestudy.model.contract.Contract;
import com.casestudy.model.contract.ContractDetail;
import com.casestudy.model.facility.Facility;
import com.casestudy.model.person.customer.Customer;
import com.casestudy.repository.facility.IFacilityRepository;
import com.casestudy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    private IContractService contractService;

    @Autowired
    private IContractDetail contractDetail;

    @Autowired
    private IAttachFacility attachFacility;

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private ICustomerService customerService;

    @ModelAttribute("facilityList")
    public List<Facility> getFacility(){
        return  facilityService.findAll();
    };

    @ModelAttribute("customerList")
    public List<Customer> getCustomer(){
        return customerService.findAll();
    };
    @ModelAttribute("attachFacilityList")
    public List<AttachFacility> getAttachFacility() {

        return attachFacility.findAll();
    }
    @ModelAttribute("contractDetailList")
    public List<ContractDetail> getContractDetail() {

        return contractDetail.findAll();
    }

    @GetMapping("")
    public  String goContractList(@PageableDefault(value = 3) Pageable pageable,
                                  Model model){
        for(Sort.Order order : pageable.getSort()){
            model.addAttribute("sortValue",order.getProperty());
        }

        model.addAttribute("contractPage",contractService.totalMoney(pageable));
        model.addAttribute("size",pageable.getPageSize());
        model.addAttribute("contract",new Contract());
        return "/contract/list";
    }
    @GetMapping("/createContract")
    public String showCreate(Model model){
        model.addAttribute("contract",new Contract());
        return "contract/list";
    }
    @PostMapping("/createContract")
    public String createContract(Contract contract){
        contractService.save(contract) ;
        return "redirect:/contract";
    }
}
