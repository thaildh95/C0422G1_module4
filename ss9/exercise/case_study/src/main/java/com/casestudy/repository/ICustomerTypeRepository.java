package com.casestudy.repository;

import com.casestudy.model.person.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
