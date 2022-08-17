package com.health.service;

import com.health.model.HealthDeclare;

import java.util.List;

public interface IHealthService {
    List<String> listDay();
    List<String> listMonth();
    List<String> listYear();
    List<HealthDeclare> listDeclare(HealthDeclare healthDeclare);
    List<String> genderList();
    List<String> nationList();
    List<String> vehicle();


}
