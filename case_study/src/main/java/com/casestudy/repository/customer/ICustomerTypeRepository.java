package com.casestudy.repository.customer;

import com.casestudy.model.person.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
