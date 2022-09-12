package com.casestudy.repository.employee;

import com.casestudy.model.person.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee>findAllByNameContaining(String name , Pageable pageable);
}
