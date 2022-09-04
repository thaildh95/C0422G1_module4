package com.casestudy.repository;

import com.casestudy.model.person.employee.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPartRepository extends JpaRepository<Part,Integer> {
}
