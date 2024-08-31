package org.demo.stockmarket.service;

import org.demo.stockmarket.entity.MarketData;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificationService {

    @Inject
    @Channel("market-alerts")
    Emitter<String> emitter;

    public void sendMarketAlert(String alertMessage) {
        emitter.send(alertMessage);
    }

    public void checkAndNotify(MarketData data) {
        double percentageChange = ((data.close - data.open) / data.open) * 100;
        if (Math.abs(percentageChange) > 5.0) {
            String alert = String.format("Significant change: %s changed by %.2f%%", data.company, percentageChange);
            sendMarketAlert(alert);
        }
    }
}
