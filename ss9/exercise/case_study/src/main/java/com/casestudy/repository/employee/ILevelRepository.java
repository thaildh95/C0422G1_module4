package com.casestudy.repository.employee;

import com.casestudy.model.person.employee.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILevelRepository extends JpaRepository<Level,Integer> {
}
