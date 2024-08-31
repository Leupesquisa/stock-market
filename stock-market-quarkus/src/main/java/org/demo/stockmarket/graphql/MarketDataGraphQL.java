package org.demo.stockmarket.graphql;

import org.demo.stockmarket.entity.MarketData;
import org.demo.stockmarket.service.MarketDataService;
import org.eclipse.microprofile.graphql.*;
import jakarta.inject.Inject;
import java.util.List;

@GraphQLApi
public class MarketDataGraphQL {

    @Inject
    MarketDataService marketDataService;

    @Query("allMarketData")
    @Description("Get all market data")
    public List<MarketData> getAllMarketData() {
        return marketDataService.getMarketData("all", "all");
    }

    @Query("marketDataByCompanyAndMonth")
    @Description("Get market data filtered by company and month")
    public List<MarketData> getMarketDataByCompanyAndMonth(
            @Name("company") String company,
            @Name("month") String month) {
        return marketDataService.getMarketData(company, month);
    }

    @Mutation
    @Description("Add new market data")
    public MarketData addMarketData(MarketData marketData) {
        marketDataService.addMarketData(marketData);
        return marketData;
    }
}

