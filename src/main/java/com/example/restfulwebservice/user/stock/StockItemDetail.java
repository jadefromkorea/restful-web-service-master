package com.example.restfulwebservice.user.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StockItemDetail {
    @Id
    private Timestamp stockDate;
    @Id
    private String stockId;
    private Timestamp createDt;

    private BigDecimal hyunJaeGa;   // 현재가
    private BigDecimal junIlGa;   // 전일가
    private BigDecimal junIlDaeBi;   // 전일대비
    private BigDecimal deungRakRyul;   // 등락률
    private BigDecimal dongIlUpJongDeungRakRyul;	// 동일업종 PER
    private BigDecimal siGa;   // 시가
    private BigDecimal goGa;   // 고가
    private BigDecimal juGa;   // 저가
    private BigDecimal sangHanGa;   // 상한가
    private BigDecimal gaHanGa;   // 하한가
    private BigDecimal choiGoGa52;   // 52주 최고
    private BigDecimal choiGuGa52;   // 52주 최저
    private BigDecimal guRaeRyang;   // 거래량
    private BigDecimal guRaeDaeGeum;   // 거래대금(백만)
    private BigDecimal akMyunGa;   // 액면가
    private BigDecimal siKaChongAk;   // 시가총액
    private BigDecimal sangJangJuSikSu;   // 상장주식수
    private BigDecimal foreignerNow;   // 외국인현재
    private BigDecimal jaBonGeum;   // 자본금
    private BigDecimal per;   // PER
    private BigDecimal dongIlUpJongPer;	// 동일업종 PER
    private BigDecimal eps;   // EPS
    private BigDecimal baeDangSuIkRyul;	// 배당 수익률

}
