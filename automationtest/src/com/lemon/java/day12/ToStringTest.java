package com.lemon.java.day12;
/*
Object类中tostring()的使用：
1.当我们输出一个对象的引用时，实际上就是调用当前对象的tostring()
2.Object类中tostring()的定义：
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
3.像String，Date,File，包装类都重写了Object类中的tostring()方法
    使得调用对象的tostring()时，返回"实体"
 */

public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("TOM",123);
        System.out.println(cust1.toString());
        System.out.println(cust1);
    }


}
