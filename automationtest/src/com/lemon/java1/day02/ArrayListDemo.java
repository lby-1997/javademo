package com.lemon.java1.day02;

import java.util.ArrayList;
/*
添加数据:list.add();
取出数据:list.get()
获取list集合大小：list.size()
移除数据:remove(...);索引位置，或者直接输入内容
清空list.clone
list.indexOf,一个元素在list中的哪个位置
其他API：
isEmpty(...)，判空方法 返回boolean   空为true，不为空为 false
contains(..),判断是否包含某数据 返回boolean 包含true不包含false
set(...),修改某个位置
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student student = new Student(2, "rr");

        System.out.println(list.toString());

//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        list.add("掌声");
//        list.add("s是");
//        list.add("z的");
//        list.add("os偶数");
//        list.add("政府");
//        list.add("方式");
//        list.add("12人");
//        list.add("13人");
//        System.out.println(list.size());
//        System.out.println(list.get(2));
//        String name = list.remove(2);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        System.out.println(name);
//        ArrayListDemo demo = new ArrayListDemo();
//        demo.toString();
//        System.out.println(list.toString());
//        boolean is = list.remove("掌声");
//        System.out.println(is);
//        System.out.println(list.toString());
//        System.out.println(list.isEmpty());
//        System.out.println(list.contains("12人"));
//        list.set(2,"f");
//        System.out.println(list.toString());
//        for(int i = 1; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(String name1 : list){
//            System.out.println(name1);
//        }


    }
}
