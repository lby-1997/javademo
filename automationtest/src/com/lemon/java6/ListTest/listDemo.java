package com.lemon.java6.ListTest;

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
public class listDemo {

}
