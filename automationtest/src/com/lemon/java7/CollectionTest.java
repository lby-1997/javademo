package com.lemon.java7;


import org.junit.Test;


import java.util.*;

/**
 * 一,集合框架的概述
 *
 * 1.集合,数据都是对多个数据进行存储操作的结构,简称java容器
 *  说明:此时的存储,主要指的时内存层面的存储,不涉及到持久化的存储()

 *  2.1数组在存储多个数据方面的特点:
 *          >一旦初始化之后,长度确定了不能修改.
 *          >比如: String[] arr; int[] arr1;一旦定义元素类型确定了.我们也就只能操作指定类型的数据了
 *              Object[] arr2;
 *  2.2数组在存储多个数据方面的缺点:
 *      > 一旦初始化以后,其长度就不可修改
 *      >数组中提供的方法非常有限,对于添加,删除,插入数据等操作,非常不便.同时效率不高
 *      >获取数据中实际元素的个数的需求,数组没有现成的属性或方法可用
 *      >数组存储数据的特点:有序,可重复.对于无序的不可重复的需求,数组无法满足
 *二,集合框架
 * *   java集合可分为Collection和Map两种体系
 *  *      collection接口:单列数据,定义了存取一组对象的方法的集合
 *  *          arraylist:元素有序,可重复的集合
 *  *          hashset:元素无序,不可重复的集合
 * *         Mao接口:双列数据,保存具有映射的关系KEY_VALUE对的集合
 *
 * |---Collection接口:单列集合,用来存储一个一个的对象
 *      |---list接口:存储有序的,可重复的数据 -->"动态数组"
 *              |---ArrayList,LinkedList,Vector
 *      |---set接口:存储无序的,不可重复的数据 -->"集合"
 *          |---HashSet,LinkedHashSet,TreeSet
 * |---map接口:双列集合,用来存储一对(key-value)一对的数据
 *          |---Hashmap, LinkedHashMap,TreeMap,Hashtable,Properties
 * 三,Collection接口中的方法的使用
 *
 * @author shkstart
 * @create 2020--11--26--20:29
 */
public class CollectionTest{
    @Test
    public void test1(){
        Collection coll  = new ArrayList();
        //add(Object e):讲元素e添加到集合coll中
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add("AA");
        coll.add("BB");
        coll.add("CC");
        coll.add("DD");
        coll.add(new Date());
        System.out.println(coll.toString());
        //size():获取添加的元素的个数
        System.out.println(coll.size());
        Collection coll1  = new ArrayList();
        coll1.add(24);
        coll1.add("ss");
        //addAll(Collection coll1):将coll1集合中的元素添加到当前的集合中
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll.toString());
        //clear():清空集合元素
        coll.clear();
        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());
    }
}