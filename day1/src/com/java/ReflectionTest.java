package com.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author shkstart
 * @create 2020--12--06--13:10
 */
public class ReflectionTest {
    //反射之前，对于Person得操作
    @Test
    public void test1(){
        //1.创建Person类得对象
        Person p1 = new Person("tom",12);
        //2.通过对象，调用其内部得属性，方法
        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();
        //在Person类外部，不可以通过Person类得对象调用其内部私有结构。
        //比如：name，showNation()以及私有得构造器
    }
    //反射之后，对于Person得操作
    @Test
    public void test2() throws Exception {
        Class cla = Person.class;
        //1.通过反射，创建Person类对象
        Constructor cons = cla.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("tom", 12);
        Person p = (Person)obj;
        System.out.println(p.toString());
        //2.通过反射，调用对象指定得属性和指定得方法
        //调用属性
        Field age = cla.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());
        //调用方法
        Method show = cla.getDeclaredMethod("show");
        show.invoke(p);
        //通过反射，可以调用Person类得私有结构得。比如：私有得构造器，方法，属性
        Constructor con1 = cla.getDeclaredConstructor(String.class);
        con1.setAccessible(true);
        Person p2 = (Person)con1.newInstance("jerry");
        System.out.println(p2);

        //调用私有得属性
        Field name = cla.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p2,"hanmei");
        System.out.println(p2);
        //调用私有方法
        Method showNation = cla.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object pp = showNation.invoke(p2, "中国");//相当于p1.showNation("中国"）;
        System.out.println(pp);
    }
    /*疑问？反射能干什么。有啥用啊，不知道.
        反射机制与面向对象中得封装性是不是矛盾得？如何看代两个技术？
           不矛盾。。
        通过直接new得方式或者反射得方式都可以调用公共得结构，到底用哪个。
        建议直接new得方式
        什么时候会使用：反射得方式。反射得特征：动态性
    * */
    /*
    关于java.lang.Class类得理解
    1.类得加载过程：
        程序经过javac.exe命令后，会生成一个活多个字节码文件(.class结尾),接着我们使用java.exe命令
        对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。此过程就称为类得加载。加载
        到内存中得类，我们就称为运行时类，此运行时类，就作为Class得一个实例。
     */
}
