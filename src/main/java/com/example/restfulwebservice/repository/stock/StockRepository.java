package com.example.restfulwebservice.repository.stock;

import com.example.restfulwebservice.user.stock.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<StockItem, Integer> {
}
