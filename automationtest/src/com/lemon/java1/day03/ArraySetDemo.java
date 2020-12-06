package com.lemon.java1.day03;

import java.util.HashSet;

/*
创建set对象
HashSet set = new HashSet();
添加数据add();
删除数据remove(..)
其他API
size()获取大小
contains()是否包含
isEmpty(),判断是否为空
clear(),数据清空
toArray(),将计核转化成为对应数据类型的数组
举例苏后面set计核的特征(无序，不可重复)
 */
public class ArraySetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.size());
        set.add("ff");
        set.add("dd");
        set.add("ss");
        set.add("xx");
        System.out.println(set.toString());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("hg"));
        set.remove("ff");
        set.clear();
        set.add("dd");
        System.out.println(set.toString());
    }
}
