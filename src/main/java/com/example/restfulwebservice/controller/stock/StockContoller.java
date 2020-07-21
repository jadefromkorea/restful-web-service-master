package com.example.restfulwebservice.controller.stock;

import com.example.restfulwebservice.repository.stock.StockRepository;
import com.example.restfulwebservice.user.stock.StockItem;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StockContoller {
    private StockRepository stockRepository;

    StockItem stockItem = new StockItem();
    String stockId;
    String stockNm;
    String stockItemUrl;

    @GetMapping("/stockItem")
    public void setStockItem() {
        String url = "https://finance.naver.com/sise/entryJongmok.nhn?&page=";
        Document doc = null;

        List<StockItem> stockItemList = new ArrayList<StockItem>();

        for(int i=1; i<=20; i++) {
            try {
                doc = Jsoup.connect(url + i).get();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Elements elements = doc.select("table tbody tr td.ctg");

            for(int j=0; j<elements.size(); j++) {
                stockNm = elements.get(j).text();
                stockItemUrl = elements.get(j).select("a").first().attr("href");
                stockId = stockItemUrl.split("=")[1];

                System.out.print("[" + ((i-1)*10+j+1) + "] ");
                System.out.print(stockNm);
                System.out.print("(");
                System.out.print(stockId);
                System.out.print(") => ");
                System.out.println(stockItemUrl);

                stockItem.setStockId(stockId);
                stockItem.setStockNm(stockNm);
                stockItem.setStockItemUrl(stockItemUrl);

                StockItem save = stockRepository.save(stockItem);
//                System.out.print("save >>>>> " + save);
            }
        }

//        stockItemList = stockRepository.findAll();
//
//        for(int j=0; j<stockItemList.size(); j++) {
//            System.out.print("[" + (j+1) + "] ");
//            System.out.print(stockItemList.get(j).getStockNm());
//            System.out.print("(");
//            System.out.print(stockItemList.get(j).getStockId());
//            System.out.print(") => ");
//            System.out.println(stockItemList.get(j).getStockItemUrl());
//        }
    }
}
