package com.lemon.java.day11;

public class Man  extends Person{
    boolean isSmoking;
    int id = 1002;
    public void Money(){
        System.out.println("Man没钱");
    }

    @Override
    public void eat() {
        System.out.println("Man没钱不吃了");
    }


    public void eac() {
        System.out.println("Man没钱不玩了");
    }
}
