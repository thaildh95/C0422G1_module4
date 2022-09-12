package com.casestudy.service.impl.employee;

import com.casestudy.model.person.employee.Part;
import com.casestudy.repository.employee.IPartRepository;
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
