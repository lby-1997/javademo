package xuexi;

/*
 Define：定义，声明
 Use:使用
 Variable：变量

 变量的使用的原则：
 （1）先声明后使用
 包括后面用到的类，方法等，都是遵循先声明后使用
 （2）变量必须先初始化（第一次赋值）再访问它的值（打印，计算，比较操作）
 （3）变量的声明，在同一个作用域中，只能声明一次，但是赋值可以使用很多次
 作用域：从变量声明开始，到它所属的大括号结束
 1，如果声明一个变量？
 格式：
    数据类型 变量名;
  2，如何给变量赋值？
  格式：
    变量名 = 变量值;
 */
public class DefineAndUseVariable {
    public static void main(String [] args){
        //int age;//声明
        //age = 18;//赋值
        int age = 18;
        age =  22;
        age = 55;
        System.out.println(age++);
    }
    public static void test(){
        System.out.println();
    }
}
