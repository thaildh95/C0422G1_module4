package com.casestudy.service.impl.customer;

import com.casestudy.model.person.customer.TradeInfo;
import com.casestudy.repository.customer.ITradeRepository;
import com.casestudy.service.ITradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeService implements ITradeService {
    @Autowired
    private ITradeRepository repository;

    @Override
    public TradeInfo save(TradeInfo tradeInfo) {
        return repository.save(tradeInfo);
    }

    @Override
    public TradeInfo findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public List<TradeInfo> findAll() {
        return null;
    }

    @Override
    public Page<TradeInfo> tradeInfo(String name,Pageable pageable) {
        return repository.findAllByFacilityTypeContaining(name,pageable);
    }
}
