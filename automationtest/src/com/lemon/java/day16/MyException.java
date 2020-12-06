package com.lemon.java.day16;
/*
如何自定义异常类？
1.继承于现有的异常结构：RuntimeException，Exception
2.提供全局常量：serialVersionUID
3.提供重载得构造器
4.
 */
public class MyException  extends Exception{
    static final long serialVersionUID = -7034897190745766939L;
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}
