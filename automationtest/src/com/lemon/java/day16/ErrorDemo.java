package com.lemon.java.day16;
/*
error：java 虚拟机无法解决的严重问题：jvm系统内部错误，资源耗尽等严重情况。一般不针对性的代码处理
exceptlon：其他因编译错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。例如：
    空指针访问
    试图读取不存在的文件
    忘了连接中断
    数组角标越界
 两种解决方法：一是预防错误就终止程序的运行。另一种方法编写程序时，考虑到错误的检测，错误消息的提示，错误的处理
 捕获错误最理想的实在编译期间，有的错误只有在运行的时候才会出现：
    比如：除数为0，数组下标越界等
        分类：编译时异常和运行时异常。
 */
public class ErrorDemo {
    public static void main(String[] args) {

        //1.栈溢出：Exception in thread "main" java.lang.StackOverflowError
        // main(args);
        //2,堆溢出:Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        // Integet[] arr = new Integet[1024*1014*1024];
    }
}
