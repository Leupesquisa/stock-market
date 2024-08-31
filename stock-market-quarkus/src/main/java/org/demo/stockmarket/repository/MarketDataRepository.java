package org.demo.stockmarket.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.demo.stockmarket.entity.MarketData;

import java.util.List;

@ApplicationScoped
public class MarketDataRepository implements PanacheRepository<MarketData> {

    public List<MarketData> findByCompanyAndMonth(String company, String month) {
        return list("company = ?1 and month = ?2", company, month);
    }
}

