package com.casestudy.service;

import com.casestudy.model.facility.ServiceType;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> findAll();
}
