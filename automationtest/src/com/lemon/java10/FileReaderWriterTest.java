package com.lemon.java10;

import org.junit.Test;

import java.io.*;

/**
 * 一，流得分类：
 * 1.操作数据单位：字节流，字符流
 * 2.数据的流向：：输入流，输出流
 * 3.流得角色：字节流，处理流
 *  * 按照校色不同分为：
 *  * 抽象基类     节点流        处理流
 *  * 输入流      InputStream   Reader
 *  * 输出流      OutputStream  Writer
 *  *          字节输入流           字节输出流                字符输入流          字符输出流
 *  *抽象基类： inputStream         |OutputStream           \Reader             Writer
 *  *访问文件： FileInputStream     |FileOutputStream       \FileReader         FileWriter
 *  *访问数组：ByteArrayInputStream |ByteArrayOutputStream  \ByteArrayReader     ByteArrayWriter
 *  *访问管道：PipedInputStream     |PipedOutputStream      \PipedReader        PipedWriter
 *  *访问字符串：                   |                       \StringReadder      StringWriter
 *  *缓冲流：BufferedInputStream    |BufferedOuputStream    \BufferedReader      BuggeredWriter
 *  *转换流：                       |                       \InputStreamReader  OutputWriter
 *  *对象流：ObjcetInputStream      |ObjectOutpuStream      \
 *  *        FilerInputStream       |FilterOutputStream     \FiterReader       FilterWriter
 *  *打印流：                       |PrintStream             \                  PrintWriter
 *  *推回输入流：PushbackInputStream|                        \PustbackReader
 *  *特殊流：DataInputStream        |DataOutputStream
 *
 *  主要内容
 *  *          字节输入流           字节输出流                字符输入流          字符输出流
 *  *抽象基类： inputStream         |OutputStream           \Reader             Writer
 *  *访问文件： FileInputStream     |FileOutputStream       \FileReader         FileWriter(字节流或文件流)
 *  *缓冲流：BufferedInputStream    |BufferedOuputStream    \BufferedReader      BuggeredWriter
 * @author shkstart
 * @create 2020--12--03--17:25
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("Hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());
        File file1 = new File("java10\\Hello.txt");
    }

    /*
    将java10下得hello.txt文件内容读取到程序中，并输出到控制台
    说明点：
    1.read()得理解：返回读入得一个字符。如果达到文件末尾返回-1
    2.异常得处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
    3.读入得文件一定要存在，否则就会报FileNotFoundException
     */
    @Test
    public void testFileReader() {
        //1.实例化File类得对象，指明要操作得文件
        FileReader fr = null;
        try {
            File file1 = new File("C:\\Users\\13370\\Desktop\\java_demo1\\automationtest\\src\\com\\lemon\\java10\\Hello.txt");//相较于当前module
            //2.提供具体得流
            fr = new FileReader(file1);
            //3.数据读入
            //read():返回读入得一个字符。如果达到文件末尾，返回-1
            //方式一
            // int data = fr.read();
            // while(data != -1){
            //     System.out.print((char)data);
            //     data = fr.read();
            // }
            int data = fr.read();
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }
            //4.流得关闭操作

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // try {if(fr != null) {
            //     fr.close();
            //     }
            // } catch (IOException e) {
            //     e.printStackTrace();
            // }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //对read()操作升级：使用read得重载方法
    @Test
    public void testFileReader1() {
        //1.File类得实例化
        FileReader fr = null;
        try {
            File file = new File("Hello1.txt");
            //2.FileReader流得实例化
            fr = new FileReader(file);
            //3.读入得操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数.如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
//        Integer it = new Integer(len);
            while ((len = fr.read(cbuf)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
                //方式二，错误的写法
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception s) {
                    s.printStackTrace();
                }
            }
        }
        //4.资源得关闭
    }

    /*
    从内存中写出数据到硬盘的文件里
    说明：
    1.输出操作，对应得File可以不存在，不存在输出过程中，会自动创建文件以及内容。
        如果存在就会对原有文件覆盖。
        再FileWriter对象得实例化得时候，如果构造器使用得是： FileWriter(file,false)/FileWriter(file),对原有文件得覆盖
                            如果构造器使用得是： FileWriter(file,true)，不会对原有文件覆盖，会在后面追加
     */
    @Test
    public void testFileWriter() {
        FileWriter fw = null;
        try {
            //1.提供File类得对象，指明写出到得文件
            File file = new File("Hello1.txt");
            //2.提供FileWriter得对象，用于数据得写出
            fw = new FileWriter(file, true);
            //3.写出得操作
            fw.write("I hava a dream!\n".toCharArray());
            fw.write("f");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        //4.流资源得关闭

    }

    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类得对象，指明读入和写出得文件
            // File srcfile = new File("Hello1.txt");
            // File destfile = new File("Hello2.txt");
            File srcfile = new File("lADPGoxXdZ3xH_TNAijNAig_52_552.jpg");
            File destfile = new File("lADPGoxXdZ3xH_TNAijNAig_552552.jpg");
            //不能使用字符类来处理文件等字节数据
            //2.创建File输入流和输出流得对象
            fr = new FileReader(srcfile);
            fw = new FileWriter(destfile);
            //3.数据得读入和写出操作
            char[] cbuf = new char[5];
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

    @Test
    public void testFileInputStreamOutputStream() {
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try {
            //1.创建File类得对象，指明读入和写出得,复制图片
            // File srcfile = new File("Hello1.txt");
            // File destfile = new File("Hello2.txt");
            File srcfile = new File("lADPGoxXdZ3xH_TNAijNAig_552_552.jpg");
            File destfile = new File("写出得1.jpg");
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
    //指定路径下文件得复制
    public void copyFile(String srcPath,String destPath){
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try {
            //1.创建File类得对象，指明读入和写出得,复制图片
            // File srcfile = new File("Hello1.txt");
            // File destfile = new File("Hello2.txt");
            File srcfile = new File(srcPath);
            File destfile = new File(destPath);
            //不能使用字符类来处理文件等字节数据
            //2.创建File输入流和输出流得对象
            fr = new FileInputStream(srcfile);
            fw = new FileOutputStream(destfile);
            //3.数据得读入和写出操作
            byte[] cbuf = new byte[1024];
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
    @Test
    public void testcopyFile(){
        long stary = System.currentTimeMillis();
        String srcPath = "C:\\Users\\admin\\Desktop\\01.mp4";
        String destPath = "C:\\Users\\admin\\Desktop\\02.mp4";
        copyFile(srcPath,destPath);
        long end = System.currentTimeMillis();
        System.out.println(end-stary);
    }
}
