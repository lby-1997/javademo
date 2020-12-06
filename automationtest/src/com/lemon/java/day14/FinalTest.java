package com.lemon.java.day14;
/*
final:最终的
1，final可以修饰的结构：类，方法，变量
2，final 用来修饰一个类:此类不能被其它类继承。
        比如:String类，System类，StringBuffer类
3，final 用来修饰方法，表明此方法不可以被重写
         比如： Object类中的getClass();
4.final 用来修饰变量：此时的"变量"就称为常量了。
            4.1 final修饰属性，可以考虑赋值的位置有：显示初始化，代码块中初始化，构造器中初始化。
            4.2 final修饰局部变量：

final修饰变量之后必须用大写，如final int num =10，必须写成， final int NUM = 10;写死。

 */

public class FinalTest {
    public static void main(String[] args) {
        FinalTest st = new FinalTest(22,33);
        System.out.println(st);
    }
    final int i = 1;
    final  int left;
    public FinalTest(){
        left = 0;
        System.out.println(left);
    }
    public FinalTest(int n,int s){
        left = 1;
        System.out.println(left);
    }
}

final class FinaLa{

}
class AA{
    public final void sow(){

    }
}
class BB extends AA{

}