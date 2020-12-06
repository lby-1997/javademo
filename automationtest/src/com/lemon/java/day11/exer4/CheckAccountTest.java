package com.lemon.java.day11.exer4;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122,29999,0.045,5000);
        acct.withdraw(5000);
        System.out.println("您的账户余额为： " + acct.getBalance());
        System.out.println("您的可透支额度为： " + acct.getOverdraft());
        acct.withdraw(18000);
        System.out.println("您的账户余额为： " + acct.getBalance());
        System.out.println("您的可透支额度为： " + acct.getOverdraft());
        acct.withdraw(3000);
        System.out.println("您的账户余额为： " + acct.getBalance());
        System.out.println("您的可透支额度为： " + acct.getOverdraft());
    }
}
