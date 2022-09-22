package com.casestudy.service;

import com.casestudy.model.person.customer.Customer;
import com.casestudy.model.person.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAllByName(String name, Pageable pageable);
    Employee save(Employee employee);
    Employee findById(int id);
    void delete(int id);
    List<Employee> findAll();

}
