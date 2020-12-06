package com.lemon.java1.day2;
import java.util.ArrayList;
/*
ArrayList,
只能声明引用类型
数据排列：有序的
数据重复性：可重复
添加数据list.add(xx);
取出数据list.get(xx);
移除数据list.remove(xx);
获取长度list.size();
isEmpty(..)判空方法
contains(..);判断是否有这个
set(..);修改某个地方
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list.size());
        list.add(44);
        list.add(55);
        list.add(55);
        list.add(55);
        list.add(55);
        System.out.println(list.size());
        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
