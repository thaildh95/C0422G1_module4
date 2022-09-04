package com.casestudy.service.impl;

import com.casestudy.model.person.employee.Part;
import com.casestudy.repository.IPartRepository;
import com.casestudy.service.IPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PartService implements IPartService {
    @Autowired
    private IPartRepository partRepository;

    @Override
    public List<Part> findAll() {
        return partRepository.findAll();
    }
}
