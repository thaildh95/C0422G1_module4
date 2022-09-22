package com.casestudy.repository.customer;

import com.casestudy.model.person.customer.TradeInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITradeRepository extends JpaRepository<TradeInfo,Integer> {
    Page<TradeInfo> findAllByFacilityTypeContaining(String name, Pageable pageable);
}
