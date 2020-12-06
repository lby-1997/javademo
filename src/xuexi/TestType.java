package xuexi;

/*
JAVA中的数据类型：
（1）基本数据类型（8种）
（2）引用数据类型（今天不讲）
String是引用数据类型

一，基本数据类型
1，整数系列
byte:字节类型 范围：-128~127，一个字节
short:短整型
    2个字节 范围： -32768~32767
int:整型
    4个字节 范围：....
long:长整型
    8个字节
     说明：对于long类型的常量，需要加大写L（建议用大写）或小写l
2，小数类型，浮点型系列
float：
    单精度浮点型，4个字节，
    大概的精度范围是，把小数用科学计数法表示后，小数点后6~7位
    说明：float类型的常量，需要在数字后面加E或f
double：
     双精度浮点型，8个字节
     大概的精度范围是，把小数用科学计数法，小数点后15~16位
3，字符类型
char：单字符类型，2个字节，可以表示汉字。
    在java中是使用unicode编码表表示。（兼容ASCII码）
    每一个字符都有一个唯一的unicode编码值
    例如：
        数字0，unicode编码值是48
        数字1，unicode编码值是49
        ....
        数字A，unicode编码值是65
        数字B，unicode编码值是66
        ....
        数字a，unicode编码值是97
        数字b，unicode编码值是98
        ...
如何便是char类型的字符常量呢？
    （1）'一个字符'，例如：'女'，'A'
    （2）'转义字符'，例如：'\n'（换行）
        ，'\t'(制表位Tab键),'\\'（斜杠）
        ，'\"'（双引号），'\''（单引号）
        ，'\b'（删除键Backspace），'\r'（回车键）

4，布尔类型
boolean：只能存两个值之一: true,false
一般boolean得值用于条件判断

计算器表示数据用二进制表示，即0和1
那么一位0或者1，我们用bit（位），最小单位
计算机中最基本的单位用的byte字节，
1字节 = 8位
1KB = 1024B
1MB = 1024KB
1GB = 1024MB
1TB = 1024GB
...
扩展：
    硬件厂商存储单位用1000进位，不是1024，
    带宽 100MB，b=bit
 */
public class TestType {
    public static void main(String[] args){
        boolean marey = true;
        if(marey){
            System.out.println("1");
        }else {
            System.out.println("2");
        }
        long tel=23123123L;
        System.out.println(tel);

        float f = 1.4f;
        System.out.println(f);

        char shuang = '"';//这样可以，单独使用"
        System.out.println(shuang);
    }
}
