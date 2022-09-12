package com.casestudy.service;

import com.casestudy.model.contract.Contract;
import com.casestudy.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetail {
    List<ContractDetail> findAll();
}
