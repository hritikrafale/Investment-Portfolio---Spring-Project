package com.example.investmentportfolio.investment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Investment {
    @Id
    @GeneratedValue
    private Long investmentId;
    private double amount;
    private int noOfUnits;
    private String company;
    private String investmentType;
    private String dateOfInvestment;
    private double currValue;
    private Long userId;

    //constructors
    public Investment(){
    }

    public Investment(Long investmentId, double amount, int noOfUnits, String company, String investmentType, String dateOfInvestment, double currValue, Long userId) {
        this.investmentId = investmentId;
        this.amount = amount;
        this.noOfUnits = noOfUnits;
        this.company = company;
        this.investmentType = investmentType;
        this.dateOfInvestment = dateOfInvestment;
        this.currValue = currValue;
        this.userId = userId;
    }

    //getters and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(Long investmentId) {
        this.investmentId = investmentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public String getDateOfInvestment() {
        return dateOfInvestment;
    }

    public void setDateOfInvestment(String dateOfInvestment) {
        this.dateOfInvestment = dateOfInvestment;
    }

    public double getCurrValue() {
        return currValue;
    }

    public void setCurrValue(double currValue) {
        this.currValue = currValue;
    }

    //toString() method

    @Override
    public String toString() {
        return "Investment{" +
                "investmentId=" + investmentId +
                ", amount=" + amount +
                ", noOfUnits=" + noOfUnits +
                ", company='" + company + '\'' +
                ", investmentType='" + investmentType + '\'' +
                ", dateOfInvestment='" + dateOfInvestment + '\'' +
                ", currValue=" + currValue +
                ", userId=" + userId +
                '}';
    }
}
