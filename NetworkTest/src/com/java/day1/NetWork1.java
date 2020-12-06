package com.java.day1;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetWork1 {
    /*
        1.网络编程中有两个主要问题
        如何准确的定位网络上的一台或者多台主机:定位主机的特定的应用
        找到主机之后如何进行通信
    2.网路编程中的要素
        IP和端口号，ip
        网络通信协议，udp，tcp
    3.ip:
             1./IP地址InetAddress：
                唯一定位一台网络上计算机(唯一标识)
                127.0.0.1 本机localhost
             2.在java中使用InetAdderss类代表IP
             3.IP分类:IPV4和IPV6;万维网和局域网, ipv4 127.0.0.1 四个字节组成，0~255.
             4.域名：www.baidu.com www.mi.com www.sina.com
                ABCD类地址
                192.168.xx.xx专门给组织内部使用的
    域名：记忆IP问题！
    1.4端口
      端口表示计算机上的一个程序的进程
        不用的进程有不同的端口号!用来区分软件
        被规定 0~65535
        TCP,UDP：65535 * 2 tcp:80,udp:80，单个写一下，端口号不能冲突
        端口分类
            公有端口：0~1023
                HTTP:80
                HTTPS:443
                FTP:21
                SHH:22
                Telent:23
            程序注册端口：1024~49151,分配给用户或者程序
                Tomcat： 8080
                Mysql： 3306
                Oracle：1521
            动态，私有：49152~65535
            netstat -ano 查看端口号
            netstat -ano|findstr "5900"#查找指定的端口
            tasklist|findstr "8696"#查看指定端口的进程
      1.5 通信协议
        协议：约定，就好比现在我们说的普通话
        网络通信协议：速率，传输码率，代码结构，传输控制...
        问题:非常的复杂？
        大事化小：分层！
        TCP/IP协议簇
            重要：TCP：用户传输协议
                  TDP:用户数据报协议
            出名的协议:
                TCP:
                IP:网络互连协议
            TCP, udp对比
            TCP:打电话
                 连接，稳定
                 三次握手，四次挥手
                    最少需要三次，保证稳定链接！
                    三次握手:A:在么
                            B:在
                            A：有东西

                 客户端，服务端
                 传输完成，释放连接，效率低
            UDP：发短信
                 不连接，不稳定
                 客户端，服务端：没有明确的界限
                 不管有没有准备好，都可以发给你。。
                 导弹
     */
    @Test
    public void test1(){
        try {
            //查询本机地址
            InetAddress InetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(InetAddress1);
            InetAddress InetAddress11 = InetAddress.getByName("localhost");//localhost/127.0.0.1
            System.out.println(InetAddress11);
            InetAddress InetAddress12 = InetAddress.getLocalHost();//LAPTOP-AJST9BL4/192.168.43.60
            System.out.println(InetAddress12);
            //查询网站IP地址
            InetAddress InetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(InetAddress2);
            InetAddress InetAddress3 = InetAddress.getByName("www.bilibili.com");
            System.out.println(InetAddress3);
            //常用方法
            System.out.println(InetAddress2.getAddress());
            System.out.println(InetAddress2.getCanonicalHostName());//规范的名字
            System.out.println(InetAddress2.getHostAddress());//ip
            System.out.println(InetAddress2.getHostName());//110.242.68.4域名，或者自己电脑的名字
            System.out.println(InetAddress2.getClass());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

}
