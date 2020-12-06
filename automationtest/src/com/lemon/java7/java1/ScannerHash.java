package com.lemon.java7.java1;

import org.junit.Test;

import java.util.*;

public class ScannerHash {
    @Test
    public void test1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入10个整数: ");
        List list = new ArrayList();
        for(int i = 0; i <= 10; i++){
           int j = scan.nextInt();
                list.add(j);
        }
        System.out.println("按照倒叙显示： ");
        Iterator iterator = list.iterator();
        Collections.reverse(list);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("按照从大到小排列：");
        Collections.sort(list);
        Collections.reverse(list);
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
