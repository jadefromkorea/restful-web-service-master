package com.example.restfulwebservice.controller.stock;

import com.example.restfulwebservice.util.Stock.StockInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockContoller {
//    @Autowired
//    private StockRepository stockRepository;

    @Autowired
    StockInfo stockInfo;

    @GetMapping("/stockItem")
    public void setStockItem() {
//        StockInfo stockInfo = new StockInfo();
//        StockInfo stockInfo = new StockInfo(stockRepository);

        stockInfo.setStockItemsInfo();

//        String url = "https://finance.naver.com/sise/entryJongmok.nhn?&page=";
//        Document doc = null;
//
//        StockItem stockItem = new StockItem();
//        String stockId;
//        String stockNm;
//        String stockItemUrl;
//
//        List<StockItem> stockItemList = new ArrayList<StockItem>();
//
//        for(int i=1; i<=20; i++) {
//            try {
//                doc = Jsoup.connect(url + i).get();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            Elements elements = doc.select("table tbody tr td.ctg");
//
//            for(int j=0; j<elements.size(); j++) {
//                stockNm = elements.get(j).text();
//                stockItemUrl = elements.get(j).select("a").first().attr("href");
//                stockId = stockItemUrl.split("=")[1];
//
//                System.out.print("[" + ((i-1)*10+j+1) + "] ");
//                System.out.print(stockNm);
//                System.out.print("(");
//                System.out.print(stockId);
//                System.out.print(") => ");
//                System.out.println(stockItemUrl);
//
//                stockItem.setStockId(stockId);
//                stockItem.setStockNm(stockNm);
//                stockItem.setStockItemUrl(stockItemUrl);
//                stockItem.setRank((i-1)*10+j+1);
//                stockItem.setCreateDt(Timestamp.valueOf(LocalDateTime.now()));
//
//                stockRepository.save(stockItem);
////                StockItem save = stockRepository.save(stockItem);
////                System.out.print("save >>>>> " + save);
//            }
//        }

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
