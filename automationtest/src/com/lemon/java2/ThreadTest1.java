package com.lemon.java2;

/**
 * 实现Runnable接口
 * 1.创建一个实现Runnable接口的类
 * 2.实现类去实现Runnable接口的类
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 * @author shkstart
 * @create 2020--11--25--11:18
 */
//1.创建一个实现Runnable接口的类
class MThread implements  Runnable{
    //2.实现类去实现Runnable接口的类
    @Override
    public void run() {
        for(int i = 0; i< 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":"+ i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MThread mThread = new MThread();
        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread);
        //5.通过Thread类的对象调用start()①，启动线程，②调用当前线程的run()-->调用了Runnable类型的target的run()
        t1.setName("线程1");
        t1.start();
        //在启动一个线程，遍历100以内的偶数
        Thread t2 = new Thread(mThread);
        t2.setName("线程2");
        t2.start();
    }
}
