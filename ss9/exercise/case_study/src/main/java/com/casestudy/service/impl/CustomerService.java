package com.casestudy.service.impl;

import com.casestudy.model.person.customer.Customer;
import com.casestudy.repository.ICustomerRepository;
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
    public Page<Customer> findAllByName(String name, Pageable pageable) {
        return repository.findAllByNameContaining(name,pageable) ;
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);

    }
}
