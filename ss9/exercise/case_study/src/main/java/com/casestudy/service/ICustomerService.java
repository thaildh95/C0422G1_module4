package com.casestudy.service;

import com.casestudy.model.person.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAllByName(String name, Pageable pageable);
    Customer save(Customer customer);
    Customer findById(int id);
    void delete(int id);
}
