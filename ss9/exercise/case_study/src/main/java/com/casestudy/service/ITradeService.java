package com.casestudy.service;

import com.casestudy.model.person.customer.TradeInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ITradeService {
    TradeInfo save(TradeInfo tradeInfo);
    TradeInfo findById(Integer id);
    void delete(Integer id);
    List<TradeInfo> findAll();
    Page<TradeInfo> tradeInfo(String name,Pageable pageable);
}
