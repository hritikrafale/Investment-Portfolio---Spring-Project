package com.example.investmentportfolio.investment;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface InvestmentRepository extends CrudRepository<Investment,Long> {
    List<Investment> findAll();
    Optional<Investment> findById(Long id);
}
