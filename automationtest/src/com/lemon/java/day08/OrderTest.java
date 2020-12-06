package com.lemon.java.day08;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        order.orderDefault = 2;
        //出了order类之后，私有的结构就不可以调用了
        //order.orderPrivate  = 3;

        order.methodDefault();
        order.methodPublic();
        //出了order类之后，私有的结构就不可以调用了
        //order.methodPrivate();
    }
}
