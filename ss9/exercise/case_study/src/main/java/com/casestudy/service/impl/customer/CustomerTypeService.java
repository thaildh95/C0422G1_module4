package com.casestudy.service.impl.customer;

import com.casestudy.model.person.customer.CustomerType;
import com.casestudy.repository.customer.ICustomerTypeRepository;
import com.casestudy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {

    @Autowired
    private ICustomerTypeRepository repository;
    @Override
    public List<CustomerType> typeList() {
        return repository.findAll();
    }
}
