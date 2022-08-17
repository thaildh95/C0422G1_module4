package com.health.repository;

import com.health.model.HealthDeclare;

import java.util.List;

public interface IHealthRepository {
    List<String> listDay();
    List<String> listMonth();
    List<String> listYear();
    List<HealthDeclare> listDeclare(HealthDeclare healthDeclare);
    List<String> genderList();
    List<String> nationList();
    List<String> vehicle();
}
