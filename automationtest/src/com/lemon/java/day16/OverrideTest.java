package com.lemon.java.day16;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
方法重写的规范之一：
子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SupeorClass1());
    }
    public void display(SuproClass s){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class SuproClass{
    public void method() throws IOException {

    }
}
class SupeorClass1 extends SuproClass{
    public void method() throws FileNotFoundException {}
}
