package com.lemon.java.day04;
/*
4，对象数组题目：
定义类Student，包含三个属性，学号number(int),年级state(int)，成绩score(int).
创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一，打印出3年级(state值为3)得学生信息。
问题二，使用冒泡排序按学生升级排序，并遍历所有学生信息.

提示，
生成随机数 Math.random()，返回值类型double.
四舍五入取整，Math.round(double d) 返回类型long
 */
public class StudentTest {
    public static void main(String[] args) {
        //声明一个Student类型数组
        Student[] st = new Student[20];
        for(int i = 0; i < st.length; i++){
            //给数组元素赋值 上面动态初始化20个，相当于new了20个
            st[i] = new Student();
            //给Student对象得属性赋值
            st[i].number = (i + 1);
            //年级[1,6]
            st[i].state = (int)(Math.random()*(6 - 1 + 1) +1);
            //成绩[0,100]
            st[i].score = (int)(Math.random()*(100 - 0 + 1));
        }
        StudentTest test = new StudentTest();
        test.print(st);

        test.searchState(st,3);
        //遍历看一下


        for(int i = 0; i<st.length; i++){
            System.out.println(st[i].info());
        }
    }
    public void print(Student[] st){
        for(int i = 0; i<st.length; i++){
            System.out.println(st[i].info());
        }
    }
    public void searchState(Student[] st,int state){
        for(int i = 0; i< st.length; i++){
            if(st[i].state == state){
                System.out.println(st[i].info());
            }
        }
    }
    public void sort(Student[] st){
        for(int i = 0; i< st.length - 1; i++){
            for(int j = 0; j < st.length - 1 -i; j++){
                if(st[j].score > st[j + 1].score){
                    //如果需要换序，交换的是数组得元素，Student对象！
                    Student temp = st[j];
                    st[j] = st[j+1];
                    st[j+1] = temp;
                }
            }
        }
    }
}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩
    //显示学生信息得方法
    public String info(){
        return "学号: " + number + "年级: " + state + "成绩: " + score;
    }
}