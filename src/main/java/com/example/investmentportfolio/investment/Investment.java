package com.example.investmentportfolio.investment;

import com.example.investmentportfolio.stock.Stock;

import javax.persistence.*;

@Entity
public class Investment {
    @Id
    @GeneratedValue
    private Long investmentId;
    private double costPerUnit;
    private int noOfUnits;
    private String dateOfInvestment;
    private Long userId;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="stockId")
    private Stock stock;

    //constructors
    public Investment(){
    }

    public Investment(Long investmentId, double costPerUnit, int noOfUnits, String dateOfInvestment, Long userId, Stock stock) {
        this.investmentId = investmentId;
        this.costPerUnit = costPerUnit;
        this.noOfUnits = noOfUnits;
        this.dateOfInvestment = dateOfInvestment;
        this.userId = userId;
        this.stock = stock;
    }

    //getters and setters

    public Long getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(Long investmentId) {
        this.investmentId = investmentId;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public String getDateOfInvestment() {
        return dateOfInvestment;
    }

    public void setDateOfInvestment(String dateOfInvestment) {
        this.dateOfInvestment = dateOfInvestment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }


    //toString() method

    @Override
    public String toString() {
        return "Investment{" +
                "investmentId=" + investmentId +
                ", costPerUnit=" + costPerUnit +
                ", noOfUnits=" + noOfUnits +
                ", dateOfInvestment='" + dateOfInvestment + '\'' +
                ", userId=" + userId +
                ", stock=" + stock +
                '}';
    }
}
