package com.lemon.java3;

import org.junit.Test;

/**
 * String的使用
 * @author shkstart
 * @create 2020--11--25--14:23
 */
public class StringTest {
    /*
    String得实例化方式:
     方式一:通过字面量定义得方式
     方式二:通过new+构造器得方式
     结论:
        常量于常量得拼接结果是在常量池.且常量池中也不会存在相同内容得常量.
        只要其中有一个是变量,结果就在堆中
        如果拼接得结果调用intern()方法,返回就在常量池中
     */
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoap";
        String s3 = "javaEEhadoap";
        String s4 = "javaEE"+"hadoap";
        String s5 = s1 + "hadoap";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        String s8 = (s1 + s2).intern();
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false
        String s9 = s5.intern();
        System.out.println(s9 == s8);
        System.out.println(s8 == s3);//false
    }
    @Test
    public void test2(){
        //此时得s1和s2得数据javaEE生命在方法去得字符串常量池中.
        String s1 = "javaEE";
        String s2 = "javaEE";
        //通过new+构造器得方式:存在堆空间中
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        Person p1 = new Person(12,"tom");
        Person p2 = new Person(12,"tom");
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        p1.name = "jerry";
        System.out.println(p2.name);
    }
    /*
    String：字符串，使用一对""引起来表示。
    1.String声明为final的，不可被继承
    2.String 实现了Serializable接口：表示字符串是可序列化
            实现了Comparable接口：表示String可以比较大小
    3.String 内部定义了final char[] value用于存储字符串数据
    4.String:代表不可变得字符序列。简称：不可变性。
        体现：1.当对字符串重新赋值时,需要重写指定内存区域符值,不能使用原有得value进行赋值
            2.当对现有得字符串进行连续操作时,也需要重新指定内存区域赋值,不能使用原有得字符串常量池
            3.当调用String得replace方法修改字符串或字符时,也需要重新指定内存区域赋值,不能使用原有得字符串常量池
    5.通过字面量得方式(区别于new)给一个字符串赋值,此时得一个字符串值声明在字符串常量池中.
    6.字符串常量池中是不会存储相同内容得字符串得.
     */

    @Test
    public void test1(){
        String s1 = "abc";//字面量得定义方式
        String s2 = "abc";
        // s1 = "hello";
        System.out.println(s1==s2);//true
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("**********************");
        String  s3 = "adc";
        s3 +="def";
        System.out.println(s3);
        System.out.println("************");
        String s4 = "abc";
        String s5 = s4.replace("a","m");
        System.out.println(s5);
    }
}
