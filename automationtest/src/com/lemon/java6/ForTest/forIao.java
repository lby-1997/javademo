package com.lemon.java6.ForTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shkstart
 * @create 2020--11--27--10:37
 */
public class forIao {
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(345);
        coll.add(556);
        coll.add(new String("tom"));
        coll.add(646);
        coll.add(false);
        //for(Object类型的变量 局部变量 : 集合对象)
        for(Object obj : coll){
            System.out.println(obj);
        }
    }
}
