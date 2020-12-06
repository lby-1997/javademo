package com.java.day2;

import java.net.InetAddress;

public class InetAddressTest {
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
     3.IP分类:IPV4和IPV6;万维网和局域网
     4.域名：www.baidu.com www.mi.com www.sina.com
     */
    public static void main(String[] args) {
        try{
        InetAddress InetAddress1 = InetAddress.getByName("127.0.0.1");
        System.out.println(InetAddress1);
    }catch (Exception e){
        e.printStackTrace();}
    }
}
