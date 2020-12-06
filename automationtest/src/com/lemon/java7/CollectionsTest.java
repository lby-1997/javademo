package com.lemon.java7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Collections:操作Collection,map的工具类
面试题：Collection和collections的区别？

 */
public class CollectionsTest {
    /*
    均为static静态方法
    reverse(list)反转list中元素的顺序
    shuffle(list)对list集合元素进行随机排序
    sort(list)根据元素的自然顺序对指定list集合元素按升序排序
    sort(List , Comparator):根据指定的Comparator产生的顺序对List集合元素进行排序
    swap(List,int ,int):将指定list集合中的i处元素和j处元素进行交换

    Object max:根据元素的自然排序，返回给定集合中的最大元素
    Object min:根据元素的自然排序，返回给定集合中的最小元素
    int frequency:返回集合中指定元素的出现次数
    void copy(list desc,list src):将src的内容复制到dest中
     */
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(1231);
        list.add(1232);
        list.add(1233);
        list.add(1234);
        //出现异常：     throw new IndexOutOfBoundsException("Source does not fit in dest");
//        List dest = new ArrayList();
//
//        Collections.copy(dest ,list);
        //正确的
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());//list.size();
        Collections.copy(dest,list);
        System.out.println(dest);
        /*
        Collections类中提供了多个synchronizedXxx()方法，该方法可使将集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
         */
        //返回的list1即为线程安全的list
        List list1 = Collections.synchronizedList(list);
    }
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(12346);
        list.add(123);
        list.add(123634);
        list.add(12335);
        list.add(1243);
        list.add(-123);
        System.out.println(list);
//        Collections.reverse(list);

//        Collections.shuffle(list);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.swap(list,1,2);
//        System.out.println(list);
//        int frequency = Collections.frequency(list,123);
//        System.out.println(frequency);

    }
}
