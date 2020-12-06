package com.lemon.java.day06;
/*
方法得重载（overload）loadint..
1.定义：在同一个类中，允许运载一个以上得同名方法，只要它们得参数个数或者参数类型不同即可。
    "两同一不同"：同一个类，相同方法名
                 参数列表不同，参数个数不同，参数类型不同
2.举例：
    Arrays类中重载得sort() / binarySearch()
3.判断是重载：
    跟方法得权限修饰符，返回值类型，形参变量名，方法体都没有关系！
4.通过对象调用方法时，如何确定某一个指定得方法：
            方法名---> 参数列表
 */
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum("ff",54);
    }
    //如下得四个方法构成了重载
    public void getSum(int i,int j){
        System.out.println("1");
    }
    public void getSum(double d1,double d2){
        System.out.println("2");
    }
    public void getSum(String s,int i){
        System.out.println("3");
    }
    public void getSum(int i,String s){
        System.out.println("4");
    }
    // public int getSum(int j, int i){
    //     return 0;
    // }
    // public void getSum(int m,int n){
    //
    // }
}
