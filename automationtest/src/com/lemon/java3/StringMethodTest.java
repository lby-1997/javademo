package com.lemon.java3;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2020--11--26--13:18
 */
/*
    int length():返回字符串得长度:return value.length
    char charAt(int index):返回某索引处得字符return value[index]
    boolean isEmpty(): 判断是否是空字符串:return value.length ==0
    String toLoewrCase():使用默认语言环境,将String中得所有字符转换为小写
    String toUpperCase():使用默认语言环境,将String中得所有字符转换为大写
    String trim():返回字符串得付本,忽略前导空白和尾部空白
    boolean equals(Object obj):比较字符串的内容是否相同
    boolean equalsIgnoreCase(String anotherString):于equals方法类似,忽略大小写
    String concat(String str):将指定字符串连接到此字符串的结尾.等价于用+
    int compareTo(String anotherString):比较两个字符串的大小
    String substring(int beginIndex):返回一个新的字符串,它是此字符串从beginIndex开始截取到beginIndex结束

     */
public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = "HHHEEELLoss";
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        String s3 = "  hello  word  ";
        String s4 = s3.trim();
        System.out.println(s3);
        System.out.println(s4);
    }
}
