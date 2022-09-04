package com.casestudy.service.impl;

import com.casestudy.model.facility.Facility;
import com.casestudy.model.person.customer.Customer;
import com.casestudy.repository.IFacilityRepository;
import com.casestudy.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository facilityRepository;

    @Override
    public Page<Facility> findAllByName(String name, Pageable pageable) {
        return facilityRepository.findAllByFacilityNameContaining(name,pageable);
    }

    @Override
    public Facility save(Facility facility) {
        return facilityRepository.save(facility);
    }

    @Override
    public Facility findById(Integer id) {
        return facilityRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        facilityRepository.deleteById(id);
    }

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }
}
