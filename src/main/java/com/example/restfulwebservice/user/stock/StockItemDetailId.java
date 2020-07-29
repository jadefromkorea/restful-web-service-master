package com.example.restfulwebservice.user.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StockItemDetailId implements Serializable {
    private Timestamp stockDate;
    private String stockId;
}
