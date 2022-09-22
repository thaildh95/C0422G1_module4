package com.casestudy.service.impl.customer;

import com.casestudy.model.person.customer.Customer;
import com.casestudy.repository.customer.ICustomerRepository;
import com.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository repository;


    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

  
}
