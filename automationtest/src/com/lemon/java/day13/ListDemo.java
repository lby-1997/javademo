package com.lemon.java.day13;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *   |---Collection接口:单列集合,用来存储一个一个的对象
 *        |---list接口:存储有序的,可重复的数据 -->"动态数组"替换原有的数组
 *                |---ArrayList:作为list接口的主要实现类:线程不安全,效率高,底层使用Object[] 存储elementData存储
 *                |---LinkedList:对于频繁的插入,删除操作,使用此类效率比Arraylist高;底层使用双向链表存储
 *                |---Vector:作为古老的实现类:线程安全的,效率低,底层使用Object[] 存储elementData存储
 *
 * 2.ArrayList的源码分析:
 *
 * 2.1jdk7的情况下:
 *      ArrayList list = new ArrayList(); //底层创建了长度是10的 Object[]数组 elementData
 *      list.add(123);//elementData[0] = new Integet(123);
 *      list.add(11);//如果此次的添加导致底层elementData数组容量不够,则扩容.
 *      默认情况下,扩容为原来的1.5倍,同时需要将原有数组中的数据复制到新的数组中.
 *      结论:建议使用带参的构造器:ArrayList list = new ArrayList(int capacity)
 * 2.2jdk8的情况下:
 *   ArrayList list = new ArrayList(); //底层Object[] elementData初始化为{},并没有创建初始化长度为10;
 *   list.add(123);第一次调用add()时,底层才创建了长度10的数组,并将数据123添加到elementDate[0]
 *   ..
 *   后续的添加和扩容操作于jdk7无异
 * 2.3小结:jdk7中的ArrayList的对象的创建类似于单例的饿汉式,而jdk8的ArrayList的对象的创建
 *          类似于单例的懒汉式,延迟了数组的创建,节省内存.
 * 3. LinkedList的源码分析:
 *      Linkedlist = list new LinkedList();内部声明了Node类型的first哈last属性,默认值为null
 *      list.add(123);将123封装到Node中,创建了Node对象
 *
 *
 *  相同点:三个类都是实现了List接口,存储数据的特点相同:存储有序的,可重复的数据
 * 不同:见上
 *
 *
 * @author shkstart
 * @create 2020--11--27--10:49
 */
public class ListDemo{
    /*
    void add(int index,Object ele):在index位置插入ele元素
    boolean addAll(int index, collection eles):从index位置开始将eles中的所有元素添加进来
    Object get(int index):获取指定index位置的元素
    int indexOf(Object obj):返回obj在集合中首次出现得位置
    int lastIndexOf(Boject obj):返回obj在当前集合中末次出现的位置
    Object remove(int index):支出指定index位置的元素，并返回此元素
    Object set(int index,Oject ele):设置指定index位置的元素为ele
    list sublist(int fromeIndex, int ToIndex):返回从fromIndex到toIndex位置的子集合
    总结：常用方法
    增：add(在最后添加)
    删：remove(输入索引位置)
    改：set(索引，修改的内容)
    查：get(指定索引，查索引的)
    插入：add(输入索引位置，输入插入内容)
    长度：size()
    遍历：① for(类型 变量 : 集合变量)
         ② Iterator迭代器方式
         ③ 普通的循环
     */
    @Test
    public void test3(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("aa");
        //方式一：迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //方式二：增强for
        for(Object name : list){
            System.out.println(name);
        }
        //方式三：普通循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
    @Test
    public void test2(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("aa");
        list.add(new Person("Tom",12));
        list.add("23");
        //    int indexOf(Object obj):返回obj在集合中首次出现得位置。如果不存在返回-1
        int index = list.indexOf("aa");
        System.out.println(index);
        //   int lastIndexOf(Boject obj):返回obj在当前集合中末次出现的位置,如果不存在-1
        System.out.println(list.lastIndexOf(456));
        Object obj = list.remove(0);
        System.out.println(obj);
        System.out.println(list);
        //    Object set(int index,Oject ele):设置指定index位置的元素为ele
        list.set(2,"dd");
        System.out.println(list);
        List os = list.subList(2,4);
        System.out.println(os);
    }
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("aa");
        list.add(new Person("Tom",12));
        list.add("23");
        System.out.println(list.toString());//[123, 456, aa, Person{name='Tom', age=12}, 23]
        //    void add(int index,Object ele):在index位置插入ele元素
        list.add(1,"bb");
        System.out.println(list.toString());//[123, bb, 456, aa, Person{name='Tom', age=12}, 23]
        //boolean addAll(int index,Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1,2,3,4,5,6);
        list.addAll(list1);
        System.out.println(list.size());//12
        System.out.println(list.toString());
        //    Object get(int index):获取指定index位®置的元素
        System.out.println(list.get(0));
    }
}