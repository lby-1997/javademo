package com.lemon.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2020--12--02--14:24
 */
public class SubOrder extends Order<Integer> {//SubOrder:不是泛型类
    public static <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e: arr){
            list.add(e);
        }
        return list;
    }
}
