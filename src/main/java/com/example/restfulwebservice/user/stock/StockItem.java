package com.example.restfulwebservice.user.stock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StockItem {
    @Id
    private String stockId;
    private String stockNm;
    private String stockItemUrl;

}
