package com.casestudy.repository;

import com.casestudy.model.person.employee.Position;
import javafx.geometry.Pos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Integer> {
}
