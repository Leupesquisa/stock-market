package org.demo.stockmarket.service;

import org.demo.stockmarket.entity.MarketData;
import org.demo.stockmarket.repository.MarketDataRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class MarketDataService {

    @Inject
    MarketDataRepository marketDataRepository;

    public List<MarketData> getMarketData(String company, String month) {
        if ("all".equals(company) && "all".equals(month)) {
            return marketDataRepository.listAll();
        } else {
            return marketDataRepository.findByCompanyAndMonth(company, month);
        }
    }

    public void addMarketData(MarketData marketData) {
        marketData.persist();
    }
}
