package com.sandwich.service.impl;

import com.sandwich.model.Spices;
import com.sandwich.repository.ISpicesRepository;
import com.sandwich.service.ISpicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpicesService implements ISpicesService {
    @Autowired
    private ISpicesRepository spicesRepository;

    @Override
    public List<Spices> spicesList() {
        return spicesRepository.spicesList();
    }
}
