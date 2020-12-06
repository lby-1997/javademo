package com.lemon.java8.day1;

import java.util.List;

/**
 * @author shkstart
 * @create 2020--12--02--16:22
 * Dao:data(base) access object
 *
 *
 *
 */
public class Dao<T> {//表的共性操作的DAO
    //添加一条记录
    public void add(T t){

    }
    //删除一条记录
    public void remove(T t){

    }
    //修改一条记录
    public void update(int index,T t){

    }
    //查询一条记录
    public T getIndex(int index){
        return null;
    }
    //查询多条记录
    public List<T> getForList(int index){
        return null;
    }
    //泛型方法
    //举例：获取表中一共有多少条记录？获取最大的员工入职时间？
    public<E> E getValue(){
        return null;
    }
}
