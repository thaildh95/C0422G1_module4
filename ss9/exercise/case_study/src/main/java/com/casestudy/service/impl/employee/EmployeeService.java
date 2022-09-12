package com.casestudy.service.impl.employee;

import com.casestudy.model.person.employee.Employee;
import com.casestudy.repository.employee.IEmployeeRepository;
import com.casestudy.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAllByName(String name, Pageable pageable) {
        return employeeRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
    employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
