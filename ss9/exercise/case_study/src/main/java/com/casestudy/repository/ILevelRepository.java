package com.casestudy.repository;

import com.casestudy.model.person.employee.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILevelRepository extends JpaRepository<Level,Integer> {
}
