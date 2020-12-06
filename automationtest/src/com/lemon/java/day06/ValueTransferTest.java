package com.lemon.java.day06;

/*
关于变量得赋值
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = m;
        System.out.println(m + ","+  n);

        n = 20;
        System.out.print(n);
        System.out.println("***************引用数据类型： ***************");
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;
        System.out.println(o1.orderId +","+ o2.orderId);
        o2.orderId = 1002;
        System.out.println(o1.orderId +","+ o2.orderId);
    }
}
class  Order{
    int orderId;
}