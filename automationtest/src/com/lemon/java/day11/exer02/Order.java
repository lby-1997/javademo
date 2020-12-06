package com.lemon.java.day11.exer02;

public class Order {
    private int orderprivate;
    int orderDefault;
    protected int orderprotected;
    public int orderpublic;
    private void methodprivate(){
        orderprivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderpublic = 4;
    }
    void method(){
        orderprivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderpublic = 4;
    }
    protected void methodprotected(){
        orderprivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderpublic = 4;
    }
    public void methodpublic(){
        orderprivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderpublic = 4;
    }
}
