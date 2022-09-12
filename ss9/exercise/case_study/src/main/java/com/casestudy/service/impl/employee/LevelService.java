package com.casestudy.service.impl.employee;

import com.casestudy.model.person.employee.Level;
import com.casestudy.repository.employee.ILevelRepository;
import com.casestudy.service.ILevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LevelService implements ILevelService {
    @Autowired
    private ILevelRepository levelRepository;
    @Override
    public List<Level> findAll() {
        return levelRepository.findAll();
    }
}
