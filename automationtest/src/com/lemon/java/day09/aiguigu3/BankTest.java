package com.lemon.java.day09.aiguigu3;
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("嗨","张翰");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(1000);
        double balance = bank.getCustomer(0).getAccount().getBalace();
        System.out.println("客户 : " + bank.getCustomer(0).getFirstName() + "账户余额为： " +balance);
        bank.addCustomer("想","李");
        System.out.println(bank.getNumbOfCustomers());
        double news = Math.round(123.333);
    }
}
