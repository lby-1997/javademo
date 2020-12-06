package com.lemon.java.day06;
/*
可变个数形参得方法

1.jdk 5.0新增得内容
2.具体使用：
    2.1 可变形参得格式：数据类型... 变量名
    2.2 当调用可变个数形参得方法时。传入得参数个数可以是：0个，1个，2个...
    2.3 可变个数形参得方法与本类中方法名相同，形参不同得方法之间构成重载
    2.4 可变个数形参得方法与本类中方法名相同，形参类型也相同得数组之间不构成重载，正常说，二者只能存在一个。
    2.5 可变个数形参在方法得形参中，必须声明在末尾
    2.6 可变个数形参在方法得形参中，最多只能声明一个可变形参
 */

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test= new MethodArgsTest();
        test.show(12);
        test.show("test");
        test.show("test","word","wors");
        test.show();
        test.show("AA","BB","CC","DD");
    }
    public void show(int i){
        System.out.println(i);
    }
    // public void show(String s){
    //
    // }
    public void show(String ... strs){
        for(String i : strs){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public void show(int i,String ... strs){

    }
}
