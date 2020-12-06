package com.lemon.java8.day1;

import org.junit.Test;

import java.util.List;

/**
 * @author shkstart
 * @create 2020--12--02--16:34
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> List = dao1.getForList(10);
        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(2);
        System.out.println(student);
    }
}
