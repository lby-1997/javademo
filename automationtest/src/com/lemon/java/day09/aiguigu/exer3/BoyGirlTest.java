package com.lemon.java.day09.aiguigu.exer3;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("李",21);
        boy.shout();
        Girl girl = new Girl("王",22);
        girl.marry(boy);
        Girl girl1 = new Girl("祝",19);
        int compare = girl.compare(girl1);
        System.out.println(compare);
        if (compare > 0) {
            System.out.println(girl.getName() + "大");
        }else if(compare < 0 ){
            System.out.println(girl1.getName() + "大");
        }else{
            System.out.println("一样大");
        }
    }
}
