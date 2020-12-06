package com.lemon.java.day11.dayjava8;
/*
jdk8:除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法.
 */
public interface CompareA  {
    public static void method1(){
        System.out.println("北京");
    }
    public default void method2(){
        System.out.println("北京2");
    }
    default void method3(){
        System.out.println("北京3");
    }
}
