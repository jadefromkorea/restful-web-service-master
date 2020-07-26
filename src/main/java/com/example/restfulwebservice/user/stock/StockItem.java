package com.example.restfulwebservice.user.stock;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

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
    private int no;
}
