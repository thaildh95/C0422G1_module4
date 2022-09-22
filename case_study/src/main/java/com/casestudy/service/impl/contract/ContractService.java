package com.casestudy.service.impl.contract;

import com.casestudy.dto.ContractPage;
import com.casestudy.model.contract.Contract;
import com.casestudy.model.person.customer.Customer;
import com.casestudy.repository.contract.IContractRepository;
import com.casestudy.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository contractRepository;

    public Page<Contract> findAllByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Contract save(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Page<ContractPage> totalMoney(Pageable pageable) {
        return contractRepository.money(pageable);
    }

    @Override
    public Contract findById(Integer id) {
        return contractRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
    contractRepository.deleteById(id);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
