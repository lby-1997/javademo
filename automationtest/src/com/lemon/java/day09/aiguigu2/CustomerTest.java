package com.lemon.java.day09.aiguigu2;

/*
(1),创建一个Customer,名字叫 Jane Smith，
他有一个账户为1000，余额为2000元，年利率为%1.23的账户。
(2)对Jane Smith操作。
存入100元，再取出960。在取出2000元。
打印出Jane Smith的基本信息
成功存入：100.0
成功取出：960.0
余额不足，取款失败
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Acount acct = new Acount(1000,2000,0.0123);
        cust.setAccount(acct);
        cust.getAccount().deposit(199);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);
        System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() + "] has aaccount: id is " + cust.getAccount().getId() + ",annualInterestRate is" + cust.getAccount().getAnnualInterestRate() * 100 +   "%, balance is " + cust.getAccount().getBalance() );
    }
}
