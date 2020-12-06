package com.lemon.java.day13;



import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
Collection接口中声明的方法的测试
向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
 */
public class CollectionTest1{
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(345);
        coll.add(556);
        coll.add(new String("tom"));
        coll.add(646);
        coll.add(false);
//        Person p = new Person("Jerry",22);
        coll.add(new Person("tom",22));
//        coll.add(p);
        //1.contains(Object obj):判断当前集合中是否包含obj
        coll.add(new Person("Jerry",22));
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("tom")));
//        System.out.println(coll.contains(p));
        System.out.println(coll.contains(new Person("Jerry",22)));//fasle---true;
        //2.containsAll(Ccllection coll1):判断形参coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }
    @Test
    public void test2(){
        //3.remove(Object obj):从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(323);
        coll.add(455);
        coll.add(898);
        coll.add(new String("tom"));
        coll.add(false);
//        coll.remove(123);
        System.out.println(coll.size());
        System.out.println(coll);
        System.out.println(coll.toString());
//        coll.remove(new String("tom"));
        System.out.println(coll);
        //4.removeAll(collection coll1):差集：从当前集合中出coll1中所有元素
        Collection coll1 = Arrays.asList(123,4567);
        coll.removeAll(coll1);
        System.out.println(coll);
        System.out.println();
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(1234);
        coll.add(1235);
        coll.add(1236);
        coll.add(new Person("Jerry",22));
        coll.add(new String("tom"));
        //retainAll(collection coll1):交集：获取当前集合和coll1集合的交集，并返回给当前集合，保留一样的，删掉不一样的
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);
        //equals(Object obj):比较两个对象是否相等,顺序也要相同，如果是hashset就不需要看顺序了
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(1234);
        coll1.add(1235);
        coll1.add(1236);
        coll1.add(new Person("Jerry",22));
        coll1.add(new String("tom"));
        System.out.println(coll.equals(coll1));
    }{
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(1234);
        coll.add(1235);
        coll.add(1236);
        coll.add(new Person("Jerry",22));
        coll.add(new String("tom"));
        //retainAll(collection coll1):交集：获取当前集合和coll1集合的交集，并返回给当前集合，保留一样的，删掉不一样的
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);
        //equals(Object obj):比较两个对象是否相等,顺序也要相同，如果是hashset就不需要看顺序了
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(1234);
        coll1.add(1235);
        coll1.add(1236);
        coll1.add(new Person("Jerry",22));
        coll1.add(new String("tom"));
        System.out.println(coll.equals(coll1));
    }
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(1234);
        coll.add(1235);
        coll.add(1236);
        coll.add(new Person("Jerry",22));
        coll.add(new String("tom"));
        coll.add(false);

        //7.hashCode 返回当前对象的哈希值
        System.out.println(coll.hashCode());
        //8.集合 -->toArray()转换为数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //扩展：数组 --->集合:调用Arrays类的静态方法aslist()
        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);
        Arrays.asList(new String[]{"AA","BB","CC"});
        //iterator():返回iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试
    }
}