package com.lemon.java2;

/**
 * 测试Thread中的常用方法：
 * 1.start():启动当前线程，调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程执行的操作声明再次方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():释放当前cpu的执行权
 * 7.join():在线程A中调用线程b的join(),此时线程a进入阻塞状态，知道线程b完全执行结束以后，线程a才结束阻塞状态
 * 8.stop():强制结束线程生命期，不推荐使用
 * 9.sleep(Long millitime):让单签线程"睡眠"制定的millitime毫秒。在指定的millitime毫秒时间内，当前线程是阻塞状态
 * 10.isAlive():判断当前线程是否存活
 * 线程优先级：
 * 1.
 * NAX_PRIORITY:10
 * MIN_PRIORITY:1
 * NORM_PRIORITY:5 -->默认的优先级
 * 2.如何获取和设置当前线程的优先级:
 *  getpriority():获取线程的优先级
 *  setpriorith(int p):设置线程的优先级
 *  说明：高优先级的线程要抢占低优先级线程cpu的执行权。但是只是从概率上讲，高优先级的线程高概率的情况下被执行。并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行。
 * @author shkstart
 * @create 2020--11--24--20:20
 */
class HelloThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 ==0){
                // try{
                //     sleep(1);}
                // catch (Exception e){
                //     e.printStackTrace();
                // }
                System.out.println(Thread.currentThread().getName() + ":"+ Thread.currentThread().getPriority() + ":"+ i);
            }
            // if (i % 20 == 0){
            //     this.yield();
            // }
        }
    }
    public HelloThread(String name){
        super(name);
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread s = new HelloThread("Thread: 1");
        // s.setName("线程1");
        s.setPriority(Thread.MAX_PRIORITY);
        s.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":"+ Thread.currentThread().getPriority() + ":"+ i);
            }
            // if(i == 20){
            //     try {
            //         s.join();
            //     } catch (InterruptedException e) {
            //         e.printStackTrace();
            //     }
            // }
        }
        System.out.println(s.isAlive());
    }
}