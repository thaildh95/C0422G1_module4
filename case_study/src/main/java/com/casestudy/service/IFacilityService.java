package com.casestudy.service;

import com.casestudy.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface IFacilityService {
    Page<Facility> findAllByName(String name, Pageable pageable);
    Facility save(Facility facility);
    Facility findById(Integer id);
    void delete(Integer id);
    List<Facility> findAll();
}
