package com.lemon.java.day09.aiguigu3;

public class Account {
    private double balace;
    public Account(double init_balance){
        this.balace = init_balance;
    }
    public double getBalace(){
        return balace;
    }
    //存钱操作
    public void deposit(double amt){
        if(amt > 0){
            balace += amt;
            System.out.println("存钱成功");
        }
    }
    public void withdraw(double amt){
        if(balace >= amt){
            balace -= amt;
            System.out.println("取钱成功");
        }else{
            System.out.println("余额不足");
        }
    }
}
