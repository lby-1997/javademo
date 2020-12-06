package com.lemon.java.day16;

import org.junit.Test;

/*
异常的处理：抓抛模型
过程一:"抛"，程序在正常执行的过程中，一旦出现异常，就会在代码异常处生成一个对应异常类的对象，
    并讲此对象抛出。
     一旦抛出对象以后，其后的代码就不在执行

     关于异常对象的产生：①，系统自动生成的异常对象
                        ②，手动的生成一个异常对象，并抛出(throw)
过程二："抓"：可以理解为异常的处理方式①，try-catch-finally ② throws
 二，trr-catch-finally的使用
 try{
    //可能出现异常的代码
 }catch(异常类型1 变量名1){
    //处理异常的方式1
}catch(异常处理2 变量名2){
    //处理异常的方式2
}catch(异常处理3 变量名3){
    //处理异常的方式3
}
...
finally{
    //一定会执行的代码
}
 说明：
1.finally是一个可选的
2.使用try将可以出现异常的代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象
    根据此对象的类型，去catch中进行匹配
3.一旦rty中的异常匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的
    try-catch结构(在没有写finally的情况)。继续执行其后的代码
4.catch中的异常类型，如果没有子父类关系，则谁声明在上，谁声明在下无所谓
  catch中的异常类型如果满足字父类关系，则子类一定声明在父类上面.
5.常用的异常对象处理的方式 ： ①，String getMessage() ②，printStackTrace()
6.在try结构中声明的变量，在出了try结构以后，就不能再被调用
7.try-catch结构可以嵌套的
体会1：使用try-catch-finally处理编译时异常，使得程序时就不再报错，但是运行时仍可能报错。
    相当于我们使用try-catch-finall将一个编译时可能出现的异常，延迟到运行时出现.
体会2：通常不针对运行时异常编写try-catch-finally，针对于编译时异常，我们说一定要考虑异常的处理。
 */
public class ExcepotionTest1 {
    @Test
    public void test2(){

    }
    // @Test
    // public void test1(){
    //     String str = "123";
    //     str = "abc";
    //     try{
    //         int num = Integer.parseInt(str);
    //         System.out.println("11");
    //     }catch (NullPointerException e){
    //         System.out.println("空指针异常勒");
    //     }catch (NumberFormatException e){
    //         System.out.println("数组转换异常勒，别急");
    //         // System.out.println(e.getMessage());
    //         e.printStackTrace();
    //     }catch(Exception e){
    //         System.out.println("fff");
    //     }
    //     System.out.println("22");
    // }
}
