package com.example.restfulwebservice.util;

import com.example.restfulwebservice.repository.stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Schedule {
    @Autowired
    private StockRepository stockRepository;

    @Scheduled(fixedRate = 60000 )
    public void scheduleForStock() {
        StockInfo stockInfo = new StockInfo(stockRepository);

        System.out.println("Schedule start time: " + LocalDateTime.now());

        stockInfo.setStockItemsInfo();

        System.out.println("Schedule end time: " + LocalDateTime.now());
    }
}
