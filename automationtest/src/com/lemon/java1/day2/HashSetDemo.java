package com.lemon.java1.day2;
/*
HashSet保存数据是无序的
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("1d");
        set.add("2d");
        set.add("3d");
        set.add("4d");
        set.add("5d");
        set.add("6d");
        set.add("7d");
        Object[] o = set.toArray();
        for(Object object : o){
            System.out.println(object);
        }
        boolean ss = set.isEmpty();
        System.out.println(ss);
        // set.clear();
        System.out.println(set.size());
        //迭代(遍历)set集合
        Iterator<String> it = set.iterator();//获取迭代器
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
