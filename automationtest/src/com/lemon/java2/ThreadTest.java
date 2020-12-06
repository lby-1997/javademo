package com.lemon.java2;

/**
 * 多线程的创建：方式一：继承于Thread类
 * 1.创建一个Thread类的子类
 * 2.重写run()方法
 * 3。创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 * 列子：遍历100以内所有的偶数
 * @author shkstart
 * @create 2020--11--23--19:52
 */
/*
程序：是为了完成特定的任务，用某种语言编写的一组指令的集合。即指，一段静态的代码，静态资源
进程：是程序的一次执行过程，或是正在运行的一个程序。是一个动态的过程：有它自身的产生，存在和消亡的过程。---生命周期
    如：运行中的QQ，运行中的MP3播放器
    程序是静态的，进程是动态的
    进程左外资源分配的单位，系统在运行时会为每个进程分配不同的内存区域。
线程:进程可进一步细化为线程，是一个程序内部的一条执行路径。
    若一个进程同一时间并行执行多个线程，就是执行多线程的
    线程作为调度和执行的单位，每个线程拥有独立的运行栈和程序计数器，线程切换的开销小
    一个进程中的多个线程共享相同的内存单元。内存地址空间-->它们从同一堆中分配对象，可以访问相同的
       变量和对象。这就使得线程间通信更简便，高效。但多个线程操作共享的系统资源可能就会带来安全的隐患。
并行与并发
    并行：多个CPU同时执行多个任务。比如:多个人同时做不同的事。
    并发：一个CPU（采用时间片）同时执行多个任务。比如：秒杀。多个人做同一件事
使用多线程的优点
    背景：以单核CPU为例，只是用单个线程先后完成多个任务(调用多个方法)，肯定比用多个线程来完成用的时间更短，为何仍需多线程呢？
多线程程序的优点：
    1.提高应用程序的相应。对图形化界面更有意义，可增强用户体验
    2.提高计算机系统CPU的利用率
    3.改善程序结构。将既长又复杂的进程分为多个线程，独立运行，利于理解和修改
何时需要多线程
    程序需要同时执行两个或多个任务
    程序需要实现一些需要等待的任务时，如用户输入，文件读写操作，网络操作，搜索等
    需要一些后台运行的程序时
 */
//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写Thread的run方法()
    @Override
    public void run() {
        for (int i = 0; i< 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //创建Thread类的子类的对象
        MyThread  t1 =  new MyThread();
        //4.通过此对象调用start(),①，启动当前线程 ② 调用当前线程的run()
        //问题一：我们不能通过直接调用run()的方式启动线程
        t1.start();
        //问题二：再启动一个线程，遍历100以内的偶数，不可以还让已经start()的线程去执行，会报错：IllegalThreadStateException
        //t1.start();Exception in thread "main" java.lang.IllegalThreadStateException
        //如下的操作仍然实在main线程中执行的.
        MyThread t2 = new MyThread();
        t2.start();
        for (int i = 0; i< 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +i +"*********main******");
            }
        }
    }
}
