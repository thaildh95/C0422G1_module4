package com.casestudy.service;

import com.casestudy.model.person.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
}
