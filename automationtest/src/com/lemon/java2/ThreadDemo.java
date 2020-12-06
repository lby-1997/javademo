package com.lemon.java2;

/**创建两个分线程，其中一个线程遍历100以内的偶数，另一个遍历100以内的奇数
 * @author shkstart
 * @create 2020--11--24--20:04
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 my1 = new MyThread1();
        my1.run();
        MyThread2 my2 = new MyThread2();
        my2.run();
        //创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + "2" + "\t" + i);
                    }
                }
            }
        }.start();
    new Thread(){
        @Override
        public void run() {
            for(int  i = 0 ; i < 100; i++){
                if(i % 2 == 0){
                    System.out.println(Thread.currentThread().getName() + ":"+ "1"+ "\t" + i);
                }
            }
        }
    }.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int  i = 0 ; i < 100; i++){
            if(i % 2 == 0){
            System.out.println(Thread.currentThread().getName() + ":"+ "1"+ "\t" + i);
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + "2" + "\t" + i);
            }
        }
    }
}