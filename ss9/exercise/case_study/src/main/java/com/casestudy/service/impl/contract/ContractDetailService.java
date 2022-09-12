package com.casestudy.service.impl.contract;

import com.casestudy.model.contract.ContractDetail;
import com.casestudy.repository.contract.IContractDetailRepository;
import com.casestudy.service.IContractDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetail {
    @Autowired
    private IContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }
}
