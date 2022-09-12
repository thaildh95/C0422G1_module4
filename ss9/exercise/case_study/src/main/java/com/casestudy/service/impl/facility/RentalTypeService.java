package com.casestudy.service.impl.facility;

import com.casestudy.model.facility.RentalType;
import com.casestudy.repository.facility.IRentalTypeRepository;
import com.casestudy.service.IRentalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalTypeService implements IRentalTypeService {
    @Override
    public List<RentalType> findAll() {
        return rentalTypeRepository.findAll();
    }

    @Autowired
    private IRentalTypeRepository rentalTypeRepository;


}
