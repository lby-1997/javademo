package com.lemon.java7;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 */
public class TreeSetTest {
    /**
     * 1.向TreeSet中添加的数据，要求是相同类的对象。
     * 2.两种排序：自然排序，定制排序
     * 3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals()
     * 4.定制排序中，比较两个对象是否相同的标准为：compare()返回0，不在是equals()
     */
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        //不能添加不同类的对象
//        set.add(123);
//        set.add(new Person1("Tom",123));
//        set.add(1352);
//        set.add("dsad");
//        set.add(12345);
        //举例一:从小到大
//        set.add(12345);
//        set.add(214124);
//        set.add(435);
//        set.add(112);
//        set.add(112);
//        //举例二：String从小到大
//        set.add("new");
//        set.add("new1");
//        set.add("newf");
//        set.add("ne");
        //举例三：
        set.add(new Person("tom",23));
        set.add(new Person("tom1",21));
        set.add(new Person("tom2",22));
        set.add(new Person("tom3",20));
        set.add(new Person("tom3",23));
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){
        Comparator com = new Comparator(){
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person&& o2 instanceof Person){
                    Person u1 = (Person)o1;
                    Person u2 = (Person)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };
        TreeSet set = new TreeSet(com);
        set.add(new Person("tom",23));
        set.add(new Person("tom1",21));
        set.add(new Person("tom2",22));
        set.add(new Person("tom3",20));
        set.add(new Person("tom44",23));
        set.add(new Person("tom55",2));
        set.add(new Person("tom66",21));
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}