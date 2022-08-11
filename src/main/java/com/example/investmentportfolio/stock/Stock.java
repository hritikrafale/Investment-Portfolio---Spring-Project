package com.example.investmentportfolio.stock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long stockId;
    private double currValuePerUnit;
    private String companyName;

    // constructors
    public Stock() {
    }

    public Stock(Long stockId, double currValuePerUnit, String companyName) {
        this.stockId = stockId;
        this.currValuePerUnit = currValuePerUnit;
        this.companyName = companyName;
    }

    // getters and setters


    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public double getCurrValuePerUnit() {
        return currValuePerUnit;
    }

    public void setCurrValuePerUnit(double currValuePerUnit) {
        this.currValuePerUnit = currValuePerUnit;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //tostring
    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", currValuePerUnit=" + currValuePerUnit +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
