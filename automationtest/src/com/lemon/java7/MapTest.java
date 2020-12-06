package com.lemon.java7;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*一：map的实现类结构情况：
    |---Map:双列数据：存储key-value对的数据
          |---HashMap:作为map的主要实现类,线程不安全，效率高;存储null的key和value
                |---LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历
                    原因：在原有的hashmap底层结构基础上，添加了一对指针，指向前一个和后一个元素
                       对于频繁的遍历操作，此类执行效率高于HashMap。
          |---TreeMap:保证按照添加的key-value对进行排序，实现排序遍历
          |---Hashtable:作为古老的实现类；线程安全，效率低，不能存储null的key和value
                |---Properties:常用来处理配置文件.key和value都是String类型

        HashMap的底层：数组+链表（jdk7以及之前）
                     数组+链表+红黑树(jdk8)

         1.hashmap的底层实现原理？
         2.hashMap和Hashtable的异同
二，Map结构的理解：
        Entry(不可重复的无序的)，一个键值对，kay-value构成一个entry -->key所在的类要重写equals()哈hashCode()(以HashMap为例)
        key不可以重复(相当于set,无序)
        value可以重复，无序的(Collection)  使用Collection存储所有的value --->value所在的类要重写equals()
        Map中的entry：无序的，不可重复的，使用set存储的所有entry
三：HashMap的底层实现原理?
   以jdk7为例说明：
   HashMap map = new HashMap():
   实例化以后，底层创建了长度是16的一维数组Entry[] table.
   ...可能已经执行过多次put...
   map.put(key1,value1);
   首先：调用key1所在类的hashCode()计算key1哈希值，此哈希值经过某种算法计算以后，得到在Entry数组中的存放位置
   如果此位置上的数据为空，此时的keys1-value1添加成功(实际上是Entry添加成功)---情况1
   如果此位置上的数据不为空(意味着此位置上存在一个或多个数据(以链表形式存在))，比较key1和已经存在的一个或多个数据的
   哈希值：
        如果key1的哈希值与已经存在的数据哈希值都不相同，此时key1-value1添加成功---情况2
        如果key1的哈希值哈已经存在的某一个数据(key2-value2)的哈希值相同，继续比较：调用key1所在类的equals()方法,比较：
                如果equals()返回false：添加成功。---情况3
                如果equals()返回true：使用value1替换value2
   补充：关于情况2和情况3：此时key1-value1和原来的数据已链表的方式存储。


   在不断的添加过程中，会涉及到扩容问题，当超出临界值时且(要添加的位置非空)，扩容，默认的扩容方式：扩容为原来容量的2倍，并将原有的数据复制过来。

   jdk8 相较于jdk7在底层实现方面的不同：
   1.new HashMap():底层没有创建一个长度为16的Entry数组
   2.jdk8 底层的数组不再是 Entry[] 叫 Node[],
   3.首次调用put()方法时，底层创建长度为16的数组
   4.jdk7底层结构只有：数组+链表。jdk8中底层结构：数组+链表+红黑树
      当数组的某一个索引位置上的元素以链表形式存在的数据个数 >8 且当前数组的长度 >64 时，此时此索引位置上的所有数据改为使用红黑树存储。
    DEFAULT_INITIAL_CAPACITY:HashMap的默认容量，16
    MAXMUM_CAPACITY:HashMap的最大支持容量,2^30
    DEFAULT_LOAD_FACTOR:HashMap的默认加载因子：0.75
    threshold：扩容的临界值，=容量*填充因子：16 * 0.75 => 12
    TREEIFY_THRESHOLE:Buclet中链表长度大于该默认值，转化为红黑树
    UNTREEIFY_THRESHOLD：Buclet中红黑树存储的Node小于该默认值，转化为链表
    MIN_TREEIFY_capacity:桶中Node被树化时最小的hash表容量(当同种Node的数量达到需要变黑红树时，若hash表容量小于MIN_TREEIFY_CARACITY时，此时应执行resize扩容操作这个MIN_TREEIFY_CAPACITY的值至少是TREEIFY_THRESHOLD的4倍。)
    table：存储元素的数组，总是2的n次幂
    entrySet：存储具体元素的集
    size：HashMap中存储的键值对数量
    modCount：HashMap扩容和结构改变的次数
    threshold：扩容的临界值，=容量*填充因子
    loadFactor：填充因子

   */

 /*
   四，LingkedHashMap的底层实现原理
        源码中：
        static class Entry<K,V> extends HashMap.Node<K,V>{
            Entry<K,V> brfore, after;//能够记录添加的元素的先后顺序
            Entry(int bash, k key, V value , Node<K,V> next){
                super(hash,key,value,next);
            }
        }
   五，Map接口中的方法
    添加，删除，修改操作：
    Objce put(Object key,Object value):将指定key-value添加到(或修改)当前map中
    void putAll(Map m):讲m中所有的key-value对存放到当前map中
    Object remove(Objcet key): 一处指定的key的key-value对，并返回value
    void clear():清空当前map中所有数据
    元素查询的操作:
    Object get(Object key)L获取指定的key对应的value
    boolean containsKey(Object key):是否包含指定的key
    boolean containsValue(Object value):是否包含指定的value
    int size():返回map中key-value对的个数
    boolean isEmpty(): 判断当前map是否为空
    boolean equals(Object obj):判断当前map和参数对象obj是否相等
    元视图操作的方法:
    Set keySet():返回所有key构成的Set计核
    Collection values():返回所有的value构成的Collection集合
    Set entrySet():返回所有的key-value对构成Set集合
 */
public class MapTest {
    @Test
    public void test3(){
        /*
    添加，删除，修改操作：
    Objce put(Object key,Object value):将指定key-value添加到(或修改)当前map中
    void putAll(Map m):讲m中所有的key-value对存放到当前map中
    Object remove(Objcet key): 一处指定的key的key-value对，并返回value
    void clear():清空当前map中所有数据
         */
        Map map = new HashMap();
        map.put("123",44);
        map.put(123,44);
        map.put("dpi",244);
        map.put("cc",44);
        map.put("cc",44);
        System.out.println(map);

    }
    @Test
    public void test2(){
        Map map = new LinkedHashMap();
        map.put(123,"bb");
        map.put(1235,"bb2");
        map.put(12365,"bb1");
        System.out.println(map);
    }
    @Test
    public void test1(){
        Map map = new HashMap();
//        map = new Hashtable();E
        Object st = map.put(null,null);
        Object s1t = map.put(123,123);
        System.out.println(map.toString());
//        System.out.println(s1t.toString());
//        System.out.println(s1t);
    }
}