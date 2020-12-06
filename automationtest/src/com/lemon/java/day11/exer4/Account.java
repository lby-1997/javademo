package com.lemon.java.day11.exer4;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;


    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }
    //取
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        System.out.println("不足");
    }
    //存
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
