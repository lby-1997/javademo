package com.java.day1;

import org.junit.Test;

import java.net.InetSocketAddress;

public class TestInetSocketAddress {
    @Test
    public void test1(){
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8080);
        InetSocketAddress inetSocketAddress1 = new InetSocketAddress("localhost", 8080);
        System.out.println(inetSocketAddress);///127.0.0.1:8080
        System.out.println(inetSocketAddress1);//localhost/127.0.0.1:8080
        System.out.println(inetSocketAddress.getAddress());///127.0.0.1
        System.out.println(inetSocketAddress.getHostName());//127.0.0.1地址
        System.out.println(inetSocketAddress.getPort());//8080端口
        System.out.println(inetSocketAddress.getAddress());
    }
}
