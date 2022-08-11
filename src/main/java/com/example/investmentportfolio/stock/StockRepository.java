package com.example.investmentportfolio.stock;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StockRepository extends CrudRepository<Stock, Long> {
    List<Stock> findAll();
    Optional<Stock> findById(Long id);
}
