package com.java.day2;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @author shkstart
 * @create 2020--12--06--12:16
 */
public class UDPTest {
    //发送端
    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String str="udp";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket  packet= new DatagramPacket(data,0,data.length,inet,9090);
        socket.send(packet);
        socket.close();
    }
    //接收端
    @Test
    public void receiver() throws IOException {
        DatagramSocket soket = new DatagramSocket(9090);
        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        soket.receive(packet);
        System.out.println(new String(packet.getData(),packet.getLength()));

        soket.close();
    }
}
