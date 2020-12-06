package com.lemon.java10;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试FileInputStream和FileOutpuStream得使用
 *
 * 结论：
 * 1.对于文本文件(.xtx,.java,.c,.cpp)，使用字符流处理
 * 2.对于非文本文件(jpg,png,ma3,map3,avi,doc,ppt...)，使用字节流处理
 * @author shkstart
 * @create 2020--12--04--10:54
 */
public class FileInputOutputStreamTest {
    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;
        try {
            //1.造文件
            //使用字节流FileInputStream处理文本文件，可能出现乱码
            File file = new File("Hello1.txt");
            //2.造流
            fis = new FileInputStream(file);
            byte[] buffer = new byte[10];
            int len;//记录每次读取得字节得个数
            while ((len = fis.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //关闭资源
    }
    @Test
    public void testFileInputStreamOutputStream() {
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try {
            //1.创建File类得对象，指明读入和写出得,复制图片
            // File srcfile = new File("Hello1.txt");
            // File destfile = new File("Hello2.txt");
            File srcfile = new File("lADPGoxXdZ3xH_TNAijNAig_552_552.jpg");
            File destfile = new File("写出得.jpg");
            //不能使用字符类来处理文件等字节数据
            //2.创建File输入流和输出流得对象
            fr = new FileInputStream(srcfile);
            fw = new FileOutputStream(destfile);
            //3.数据得读入和写出操作
            byte[] cbuf = new byte[5];
            int len;//记录每次读入到cbuf得字符个数
            while ((len = fr.read(cbuf)) != -1) {
                //每次写出len个字符
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

