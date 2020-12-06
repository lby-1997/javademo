package com.lemon.java.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
异常处理的方式二：throws + 异常类型
1.throws + 异常类型，写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
    一旦当方法执行时，出现异常，仍会在异常代码处生成一个异常类的对象。此对象满足throws后异常类型时
    就会被抛出。异常代码后续的代码，就不会再执行！
2.体会：try-catch-finally:真正的将异常给处理掉了。
        throws的方式只是将异常抛给了方法的调用者,并没有真正的将异常处理掉。
3.如何选择使用try-catch-finall 还是throws?
    3.1如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，意味着
        如果子类重写的方法中有一场，必须使用try-catch-finally方式处理
    3.2 执行的方法中，现后又调用了另外的几个方法，这几个方法是递进关系执行得。我们建议几个方法使用
        thrws的方式进行处理。而执行的方法A可以考虑try-catch-finally方式进行处理
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
            mehod2();
        }catch(IOException e) {
            e.printStackTrace();
        }finally{
            System.out.println("到main别跑了");
        }
    }
    public static void mehod2() throws IOException{
        method1();
    }
    public static void method1() throws IOException {
        File file = new File("D:\\metaapp\\automationtest\\src\\com\\lemon\\java\\day16\\Try\\hello");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while(data != -1){
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();
    }
}
