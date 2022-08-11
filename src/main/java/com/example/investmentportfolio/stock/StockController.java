package com.example.investmentportfolio.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    private StockRepository stockRepository;

    @GetMapping("stock")
    public Stock getStock(@RequestParam Long id){
        return stockRepository.findById(id).get();
    }

    @GetMapping("stocks")
    public List<Stock> getStocks(){
        return stockRepository.findAll();
    }

    @PostMapping("new_stock")
    public void addStock(@RequestBody Stock stock){
        stockRepository.save(stock);
    }

    //TODO : update everything
    @PutMapping("update_stock")
    public Stock updateStock(@RequestParam Long id, @RequestBody Stock stock){
        Stock currStock = stockRepository.findById(id).get();
        stockRepository.save(currStock);
        return currStock;
    }

    @DeleteMapping("delete_stock")
    public void deleteStock(@RequestParam Long id){
        stockRepository.deleteById(id);
    }
}
