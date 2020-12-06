package com.lemon.java.day15;
/*
接口的使用
1.接口的使用上也满足多态性
2.接口，实际上就是定义了一种规范
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferDate(flash);
    }
}
class Computer{
    public void transferDate(USB usb){
        usb.start();
        System.out.println("具体传数据的细节");
        usb.stop();
    }
}
interface USB{
    //定义了长，宽，最大最小的传输速度等。
    public abstract void start();
    public abstract void stop();
}
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始功能");
    }

    @Override
    public void stop() {
        System.out.println("u盘结束工作");
    }
}

class Printer implements USB {


    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
