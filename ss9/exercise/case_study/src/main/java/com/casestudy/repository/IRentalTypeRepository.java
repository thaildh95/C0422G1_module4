package com.casestudy.repository;

import com.casestudy.model.facility.RentalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentalTypeRepository extends JpaRepository<RentalType,Integer> {
}
