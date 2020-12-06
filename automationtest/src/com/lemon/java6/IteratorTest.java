package com.lemon.java6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1.使用Iterator迭代器接口
 * 用hasNext,next遍历
 * 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象,默认游标都在集合的第一个元素之前.
 * 3.内部定义了remove(),可以在遍历的时候,删除集合中的元素.此方法不同于集合直接调用remove()
 * @author shkstart
 * @create 2020--11--27--10:06
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(345);
        coll.add(556);
        coll.add(new String("tom"));
        coll.add(646);
        coll.add(false);
        Iterator iterator = coll.iterator();
        //方式一:多写会NoSuchElementException
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // 方式二:不推荐
        // for (int i = 0; i < coll.size(); i++) {
        //     System.out.println(iterator.next());
        // }
        //方式三:推荐
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(345);
        coll.add(556);
        coll.add(new String("tom"));
        coll.add(646);
        coll.add(false);
        Iterator iterator = coll.iterator();
        /*java.util.NoSuchElementException,会跳着输出
        while((iterator.next()) != null ){
            System.out.println(iterator.next());
        }*/
        //这种每次都会调用一次iterator,每次出来的都是新得,会无限循环第一个
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(345);
        coll.add(556);
        coll.add(new String("tom"));
        coll.add(646);
        coll.add(false);
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if("tom".equals(obj)){
                iterator.remove();
            }
        }
        iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
