package com.lemon.java10;

import org.junit.Test;

import java.io.*;

/**
 *  *  *       字节输入流           字节输出流                字符输入流          字符输出流
    缓冲流：BufferedInputStream    BufferedOuputStream     BufferedReader       BufferedWriter
 * @author shkstart
 * @create 2020--12--04--15:17
 * 2.提供流得读取，写入得速度
 *  提高读写文件速度得原因：内部提供了缓冲区
 * 3.处理六，就是"套接"在已有得流得基础上
 */
public class BufferedTest {
    /*
    喜欢非文本文件得复制
     */
    @Test
    public void BufferedStreamTest(){
        //1.造文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcfile = new File("写出得.jpg");
            File destfile = new File("写出得2.jpg");
            //2.造流
            //3.造节点流
            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(destfile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.复制得细节：读取，写入
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            //要求：现关闭外层得流，在关闭内层得流
            //说明：关闭外层流得同时，内层流也会地总进行关闭。关于内层流得关闭，可以省略。
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void copyFileWithBufferd(String srcPath,String destPath){
        //1.造文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcfile = new File(srcPath);
            File destfile = new File(destPath);
            //2.造流
            //3.造节点流
            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(destfile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.复制得细节：读取，写入
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
                bos.flush();//刷新缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            //要求：现关闭外层得流，在关闭内层得流
            //说明：关闭外层流得同时，内层流也会地总进行关闭。关于内层流得关闭，可以省略。
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void testCopyFileWithBuffered(){
        long stary = System.currentTimeMillis();
        String srcPath = "C:\\Users\\admin\\Desktop\\01.mp4";
        String destPath = "C:\\Users\\admin\\Desktop\\02.mp4";
        copyFileWithBufferd(srcPath,destPath);
        long end = System.currentTimeMillis();
        System.out.println(end-stary);
    }
    /*
    使用BufferedReader和BuffereWriter实现文本文件得复制
     */
    @Test
    public void testBufferedReaderBuggeredWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp1.txt")));
            //读写操作
            //方式一：使用char[]数组
            // char[] cbuf = new char[1024];
            // int len;
            // while((len = br.read(cbuf)) != -1){
            //     bw.write(cbuf,0,len);
            // }
            //方式二：使用String
            String data;
            while((data = br.readLine()) != null){
                bw.write(data);//data中不包含换行符
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null){
            //关闭资源
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(br != null){
                    try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
