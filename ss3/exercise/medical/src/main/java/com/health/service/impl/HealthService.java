package com.health.service.impl;

import com.health.model.HealthDeclare;
import com.health.repository.IHealthRepository;
import com.health.service.IHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HealthService implements IHealthService {
    @Autowired
    private IHealthRepository healthRepository;
    @Override
    public List<String> listDay() {
        return healthRepository.listDay();
    }

    @Override
    public List<String> listMonth() {
        return healthRepository.listMonth();
    }

    @Override
    public List<String> listYear() {
        return healthRepository.listYear();
    }

    @Override
    public List<HealthDeclare> listDeclare(HealthDeclare healthDeclare) {
        return healthRepository.listDeclare(healthDeclare);
    }

    @Override
    public List<String> genderList() {
        return healthRepository.genderList();
    }

    @Override
    public List<String> nationList() {
        return healthRepository.nationList();
    }

    @Override
    public HealthDeclare searchById(String id) {
        return healthRepository.searchById(id);
    }

    @Override
    public void update(String id, HealthDeclare healthDeclare) {
        healthRepository.update(id, healthDeclare);
    }

    @Override
    public List<HealthDeclare> showList() {
        return healthRepository.showList();
    }

    @Override
    public List<String> vehicle() {
        return healthRepository.vehicle();
    }
}
