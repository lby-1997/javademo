package com.lemon.java.day09;

import com.lemon.java.day08.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;

        //order.orderDefault = 2;
        //出了order类之后，私有的结构就不可以调用了
        //order.orderPrivate  = 3;

        //除了Order类所属得包之后，私有得结构，缺省声明得结构就不能调用了。
        //order.methodDefault();
        order.methodPublic();
        //出了order类之后，私有的结构就不可以调用了
        //order.methodPrivate();
    }
}
