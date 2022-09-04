package com.casestudy.repository;

import com.casestudy.model.facility.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceTypeRepository extends JpaRepository<ServiceType,Integer> {
}
