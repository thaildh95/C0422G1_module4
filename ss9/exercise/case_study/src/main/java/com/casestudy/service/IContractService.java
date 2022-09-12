package com.casestudy.service;

import com.casestudy.dto.ContractPage;
import com.casestudy.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Contract save(Contract contract);
    Contract findById(Integer id);
    void delete(Integer id);
    List<Contract> findAll();
    Page<ContractPage> totalMoney(Pageable pageable);

}
