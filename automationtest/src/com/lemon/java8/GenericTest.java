package com.lemon.java8;

import org.junit.Test;

import java.util.*;
/**
 * @author shkstart
 * @create 2020--12--02--11:26
 */
public class GenericTest {
    /*
    泛型得使用：
    1.jdk5.0新增得特性
    2.在集合中使用泛型：
    总结：
        ①，集合接口或集合类在jdk5.0时都修改为带泛型得结构。
        ②，在实例化集合类时，可以知名具体得泛型类型
        ③，指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法，构造器，属性等）使用到类得泛型的位置，都指定为实例化时的泛型类型。
            比如add(E e) --->实例化以后： add(Integer e)
        ④，注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换
        ⑤，如果实例化时，没有指明泛型的类型。默认为java.lang.Object类型
    3.自定义泛型结构：泛型类，泛型接口，泛型方法。见GenericTest1

    元素得类型设计成一个参数，这个类型参数就叫做泛型。Colection<E>,List<E>,ArrayList<E>,这个<E>就是类型参
    数，即泛型
        所谓泛型，就是允许再定义类，接口时通过一个标识表示类中某个属性得类型或者是某个方法得返回值及参数类型。这个
    类型参数将再使用时(例如，继承或实现这个接口，用这个类型声明变量，创建对象时)确定(即传入实际的类型参数，也成为类型实参)
     */
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(23);
        list.add(232);
        list.add(232);
        list.add(23213);
        list.add(235);
        list.add("T");
        for(Object score: list){
            //问题：强转时由其他类型会出现异常ClassCastException
            int stuScore = (Integer)score;
            System.out.println(stuScore);
        }

    }
    //再集合中使用泛型得情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(213);
        list.add(2133);
        list.add(21312);
        list.add(213543);
        //编译时，就会进行类型检查，保证数据得安全
        // list.add("T");
        // Iterator iterator = list.iterator();
        // while (iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }
        for(Integer sc : list){
            int su = sc;
            System.out.println(su);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }
    //再集合中使用泛型得情况：以HashMap为例
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("TOM1",22);
        map.put("TOM2",22);
        map.put("TOM4",null);
        map.put("TOM5",null);
        //泛型得嵌套
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            Integer value = next.getValue();
            String key = next.getKey();
            System.out.println(value+key);
        }
    }
    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
    //换句话说，泛型方法所属的类是不是泛型类都没有关系
    public<E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e: arr){
            list.add(e);
        }
        return list;
    }
}
