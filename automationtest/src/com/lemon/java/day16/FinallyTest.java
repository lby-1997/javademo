package com.lemon.java.day16;

import org.junit.Test;

/*
try-catch-finally中finally的使用：
1.finally是可选的
2.flnally中声明的是一定会被执行的代码，即使catch中又出现异常勒，try中有return语句，catch中有return语句
3.什么情况下使用:像数据库连接，输入输出流，网络编程Socket等资源，JVM是不能自动的回收的，我们需要自己手动的进行
    资源的释放，此时的资源释放，就需要声明在finalyy中。
 */
public class FinallyTest {
    @Test
    public void test2(){

    }
    @Test
    public void test1(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch(Exception e){
            e.printStackTrace();
            try{
            int[] arr = new int[10];
            System.out.println(arr[10]);
            }catch (Exception s){
                s.printStackTrace();
            }
        }
        finally{
            System.out.println("c");
        }
    }
}
