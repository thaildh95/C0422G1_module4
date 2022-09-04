package com.casestudy.service.impl;

import com.casestudy.model.facility.ServiceType;
import com.casestudy.repository.IServiceTypeRepository;
import com.casestudy.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository serviceTypeRepository;


    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
