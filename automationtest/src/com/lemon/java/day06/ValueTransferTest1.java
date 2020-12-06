package com.lemon.java.day06;
/*
方法得形参传递机制：值传递
1.形参：方法定义时，声明得小括号内得参数
  实参：方法调用时：实际传递给形参得数据
2.值传递机制：
   如果参数时基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
   如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值.
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        //交换两个变量得值得操作
        int m = 10;
        int n = 20;
        System.out.println(m +","+ n);
        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(m,n);
        // int temp = m;
        // m = n;
        // n = temp;
/*        System.out.println(m +","+ n);*/
    }
    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println(m + "," +n);
    }
}
