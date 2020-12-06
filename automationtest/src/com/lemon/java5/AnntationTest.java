package com.lemon.java5;

import org.junit.Test;

import java.util.Date;

/**
 * 1.理解Annotation:
 * jdk 5.0添加的
 *
 * 2.Annotation的使用示例
 * @Override:限定重写父类的方法,只能用于方法
 * @deprecated:用于表示所修饰的元素(类,方法等)已过程.通常时因为所修饰的结构危险或存在更好的选择
 * @SuppressWarnings: 编译器警告
 * @author shkstart
 * @create 2020--11--26--16:33
 *示例三:跟踪代码依赖性,实现替代配置文件功能
 * 3.如何自定义注解:参照@SuppressWarnings定义
 *  ①注解声明为:@interface
 *  ②内部定义成员,通常使用value表示
 *  ③,可以指定成员的默认值,使用default定义
 *  ④,如果自定义注解没有成员,表明是一个标识作用
 *
 *  如果注解有成员,在使用注解时,需要指明成员的值.
 *  自定义注解必须配上注解的信息处理流程(使用反射)才有意义.
 *  自定义注解通过都会指明两个元注解:Retention,Target
 *  4.jdk 提供的四种元注解
 *  元注解:对现有的注解进行解释说明的注解
 *  meta-annotation类型的:
 *  Retention:指定所修饰的Annotation的生命周期:SOURCE\CLASS(默认行为)\RUNTTME只有
 *          声明为RUNTIME声明周期的注解,才能通过反射获取.
 *  Target:用于指定被修饰的Annotation能用于修饰哪些程序元素
 *  ***频率低***很少用
 *  Documented:表示所修饰的注解在被javadoc解析时,保留下来
 *  Inherited:被它修饰的Annotation将具有继承性.
 *  通过反射来获取注解信息
 *  6.jdk 8 中注解的新特性:可重复直接,类型注解
 *      6.1可重复注解:①,在MyAnnotation上声明@Repeatable,成员值,MyAnnotations.class
 *          ②,在MyAnnotation的Target和Retention和Myannotation相同
*       6.2 类型注解:
 *          ElemenType.TYPE_PARAMETER 表示该注解能写在类型变量的声明语句中
 *          ElemenType.TYPE_USE 表示该注解能写在使用类型的任何语句中
 *
 */
public class AnntationTest {
    public static void main(String[] args) {
        Date date = new Date(2020,10,11);
        System.out.println(date);
        int num = 10;
        System.out.println(num);

    }
    @Test
    public void testGetAnnotation(){

    }
}

@MyAnnotation
class Person{
    private String name;
    private int age;

    public Person() {
    }
    @MyAnnotation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void  walk(){
        System.out.println("zou");
    }
}
interface Info{
    void show();
}
class Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("走路");
    }

    @Override
    public void show() {
        System.out.println("报错");
    }
}