package com.lemon.java.day11.exer5;

public class WoMen extends Person {
    boolean isBeauty;
    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat() {
        System.out.println("womeneat");
    }

    @Override
    public void eac() {
        System.out.println("womeneac");
    }
}
