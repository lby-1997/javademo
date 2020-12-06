package com.lemon.java4;

/**
 * 一,枚举类的使用:
 * 1.枚举类的理解:类的对象只有有限个,确定的.我们称此类为枚举类
 * 2.当需要定义一组常量时,强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象,则可以作为单例模式的实现方式
 *
 * 二,如何定义枚举类
 * 方式一:自定义枚举类
 * 方式二:可以使用enum关键字定义枚举类
 * 使用enum关键字定义枚举类:
 * 说明:定义的枚举类默认继承于class java.lang.Enum
 * 四,使用enum的方法实现接口
 * 情况一:实现接口,在enum类中实现抽象方法
 * 让枚举类的对象分别实现接口的抽象方法
 * @author shkstart
 * @create 2020--11--26--15:06
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1  sum = Season1.SPRINT;
        System.out.println(sum.toString());
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println(sum);
        System.out.println(Season1.class.getSuperclass());
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length ; i++) {
            System.out.println(values1[i]);
        }
        System.out.println("******************");
        //valueOF(String objName):返回枚举类中对象名时objName的对象.
        //如果没有找到objName的枚举类对象,则抛出异常:IllegaLArgumentExcption
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}
interface Info{
    void show();
    public abstract void sohw();
}
enum Season1 implements Info{

    SPRINT("春天","累了"){
        @Override
        public void show() {
            System.out.println("春天");

        }
    },
    SUMMER("夏天","累了"){
        @Override
        public void show() {
            System.out.println("夏天");

        }
    },
    AUTUMN("秋天","累了"){
        @Override
        public void show() {
            System.out.println("秋天");

        }
    },
    WINTER("冬天","累了"){
        @Override
        public void show() {
            System.out.println("冬天");
        }

        @Override
        public void sohw() {
            System.out.println("冬天");

        }
    };
    //1.声明Season对象的属性 private final修饰
    private final String seasonNmae;
    private final String seasonDesc;

    //1.私有化构造器,并给对象属性赋值
    private Season1(String seasonDesc, String seasonName){
        this.seasonDesc = seasonDesc;
        this.seasonNmae = seasonName;
    }
    //3,提供当前枚举类的多个对象

    //4.获取枚举类对象的属性

    public String getSeasonNmae() {
        return seasonNmae;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }



    @Override
    public void sohw() {

    }
    //5,提供tostring方法

    // @Override
    // public String toString() {
    //     return "Season{" +
    //             "seasonNmae='" + seasonNmae + '\'' +
    //             ", seasonDesc='" + seasonDesc + '\'' +
    //             '}';
    // }
}
