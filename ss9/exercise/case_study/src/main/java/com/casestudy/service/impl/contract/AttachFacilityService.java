package com.casestudy.service.impl.contract;

import com.casestudy.model.contract.AttachFacility;
import com.casestudy.repository.contract.IAttachFacilityRepository;
import com.casestudy.service.IAttachFacility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacility {
    @Autowired
    private IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }
}
