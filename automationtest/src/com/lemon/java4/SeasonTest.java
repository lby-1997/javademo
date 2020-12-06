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
 * @author shkstart
 * @create 2020--11--26--15:06
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season sprint = Season.SPRINT;
        System.out.println(sprint);
    }
}
class Season{
    //1.声明Season对象的属性 private final修饰
    private final String seasonNmae;
    private final String seasonDesc;

    //1.私有化构造器,并给对象属性赋值
    private Season(String seasonDesc, String seasonName){
        this.seasonDesc = seasonDesc;
        this.seasonNmae = seasonName;
    }
    //3,提供当前枚举类的多个对象
    public static final Season SPRINT = new Season("春天","累了");
    public static final Season SUMMER = new Season("夏天","累了");
    public static final Season AUTUMN = new Season("球天","累了");
    public static final Season WINTER = new Season("冬天","累了");
    //4.获取枚举类对象的属性

    public String getSeasonNmae() {
        return seasonNmae;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //5,提供tostring方法

    @Override
    public String toString() {
        return "Season{" +
                "seasonNmae='" + seasonNmae + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
