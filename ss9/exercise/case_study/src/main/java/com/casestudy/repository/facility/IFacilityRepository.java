package com.casestudy.repository.facility;

import com.casestudy.model.facility.Facility;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Qualifier
@Repository
public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
    Page<Facility> findAllByFacilityNameContaining(String name, Pageable pageable);

}
