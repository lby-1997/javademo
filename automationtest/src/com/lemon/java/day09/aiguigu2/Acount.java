package com.lemon.java.day09.aiguigu2;

public class Acount {
    private int id;//账户
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Acount(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
    public void withdraw(double amout){//取钱
        if(balance < amout){
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= amout;
        System.out.println("成功取出： "+ amout);
    }
    public void deposit(double amount){//存钱
        if(amount >0){
            balance +=amount;
            System.out.println("成功存入： " + amount);
        }
    }
}
