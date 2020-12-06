package com.lemon.java1.day01;
/*
String类：
        equals():判断两个数据是否一样
        equalslgnreCase():判断两个数据是否一样，并且忽略大小写
        contains():判断是否包含某个信息
        indexOf():获取字符串中某个内容第一次出现的索引位置
        lastlndexOf():获取字符串中某个内容最后一次出现的索引位置
        isEmpyt():判断是否位空
        substring():截取字串
        toUpperCase():讲字符串转化为大写
        toLowerCase():讲自负床转化为小写
        length():获取长度
        split():按照某个正则表达式来切割自负床
        charAt():获取指定位置上的字符
 */
public class StringApi {
    public static void main(String[] args) {
        String name = "张三";

        System.out.println(name.substring(0,1));
    }
}
