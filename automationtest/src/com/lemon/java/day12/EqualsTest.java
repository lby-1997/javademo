package com.lemon.java.day12;
/*
==和equals()区别
一，回顾 == 的使用：
== 运算符
1.可以使用在基本数据类型变量和引用数据类型变量中
2.如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等。（不一定类型要相同）
   如果比较的是引用数据类型变量，比较两个对象的地址值是否相同
二，equals()的使用
1.是一个方法，而非运算符
2.只适用于引用数据类型
3.Object类中equals()定义：
    public voolean equals(Object obj){
        return(this == obj)};
    说明：Object中的equals跟==是相同的，比较的是基本数据类型变量，比较两个变量保存的数据是否相等
4.像String,Date,File,包装类等类都重写了Object类中的equals()方法。重写以后，比较的不是地址值，比较的是类中的实体内容是否相同。
5.通常情况下，我们自定义的类如果使用equals()得话，也通常是比较两个对象的"实体内容"是否相同，那么我们
    就需要对Object类中的equals()进行重写.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        Customer cust2 = new Customer("Tom",21);
        System.out.println(cust1 == cust2);
        System.out.println(cust1.equals(cust2));

    }
}
