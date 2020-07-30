package com.example.restfulwebservice.util.Schedule;

import com.example.restfulwebservice.util.Stock.StockInfo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Schedule {
//    @Autowired
//    private StockRepository stockRepository;

/*
    * CRON 크론 표현식
    초   |  분   |  시  |  일   |  월   |   요일  |   연도
    0~59 | 0~59 | 0~23 | 1~31 | 1~12  |   0~6  | 1970~2099(옵선, 생략가능)

    요일 : 0 (일요일) ~ 6( 토요일)
    ? : 설정 값 없을 때 - 일과 요일 에서만 사용가능
    * : 모든조건
    시작시간/단위 : 시작시간부터 해당 단위 때
    시작범위-끝범위 : 시작범위 부터 끝범위까지
    L : 마지막 - 일, 요일 에서만 사용가능
    W : 가장 가까운 평일 찾는다 - 일 에서만 사용가능
        ex) 10W
            -10일이 평일 일 때 : 10일에 실행
            -10일이 토요일 일 때 : 가장 가까운 평일인 금요일(9일)에 참
            -10일이 일요일 일 때 : 가장 가까운 평일인 월요일(11일)에 참
    # : 몇주 째인지 찾는다 - 요일 에서만 사용가능
        ex) 3#2 : 수요일#2째주 에 참

    * 예제
    1) 매월 10일 오전 11시
        0  1  1  10  *  *
    2) 매일 오후 2시 5분 0초
        0  5  14  *  *  *
    3) 10분마다 도는 스케줄러 : 10분 0초, 20분 0초...
        0  0/10  *  *  *
    4) 조건에서만 실행되는 스케줄러 : 10분 0초, 11분 0초 ~ 15분 0초까지 실행
        0  10-15  *  *  *
*/

//    @Scheduled(fixedRate = 60000 )
    // 월요일 부터 금요일 까지 매일 오후 18시
    @Scheduled(cron = "0 0 18 * * 1-5")
    public void scheduleForStock() {
        StockInfo stockInfo = new StockInfo();
//        StockInfo stockInfo = new StockInfo(stockRepository);

        System.out.println("Schedule start time: " + LocalDateTime.now());

        stockInfo.setStockItemsInfo();

        System.out.println("Schedule end time: " + LocalDateTime.now());
    }
}
