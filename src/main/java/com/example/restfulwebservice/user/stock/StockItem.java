package com.example.restfulwebservice.user.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StockItem {
    @Id
    private String stockId;
    private String stockNm;
    private String stockItemUrl;
    private int rank;
    private Timestamp createDt;
}
