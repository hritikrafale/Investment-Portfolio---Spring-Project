package com.example.investmentportfolio.user;

import com.example.investmentportfolio.investment.Investment;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    // properties
    @Id
    @GeneratedValue
    private Long userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String contactNumber;
    private double annualIncome;
    private String panNumber;
    private String dob;
    private String gender;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private List<Investment> investments;

    //constructors
    public User() {
    }

    public User(Long userId, String userName, String password, String firstName, String lastName, String email, int age, String contactNumber, double annualIncome, String panNumber, String dob, String gender, List<Investment> investments) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.contactNumber = contactNumber;
        this.annualIncome = annualIncome;
        this.panNumber = panNumber;
        this.dob = dob;
        this.gender = gender;
        this.investments = investments;
    }

    // getters and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }

    public void addInvestment(Investment investment){
        investments.add(investment);
    }

    //toString method

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", contactNumber='" + contactNumber + '\'' +
                ", annualIncome=" + annualIncome +
                ", panNumber='" + panNumber + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", investments=" + investments +
                '}';
    }
}
