package com.lemon.java9;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * File的使用
 * 1.File类的使用，代表一个文件或一个文件目录(俗称：文件夹)
 * 2.
 */
public class FileTest {
    /*
    1.如何创建File的实例
        File(String filePath);
        File(String parentpath,String childPath)
        File(File parentFile,String childPath)
    2.File在java.io下
    3.File类中涉及到关于文件或文件目录的创建，删除，重命名，修改时间，文件大小等方法，
        并未涉及到写入或读取文件内容的操作。如果需要读取或写入文件内容，必须使用IO流来完成
    4.后续File类的对象常会作为参数传递到流的构造器中，指明读取或写入的"终点"
    相对路径：相较于某个路径下，指明的路径

    绝对路径：包含盘符在内的文件或文件目录的路径
     */
    @Test
    public void test1(){
        //构造器1
        File file1 = new File("Hello.txt");//相对于当前module//Hello.txt
        File file2 = new File("C:\\Users\\13370\\Desktop\\hello.txt");//C:\Users\13370\Desktop\hello.txt
        System.out.println(file1);
        System.out.println(file2);
        //构造器2：
        File file3 = new File("C:\\Users\\13370","java_demo1");//C:\Users\13370\java_demo1
        System.out.println(file3);
        //构造器3
        File file4 = new File(file3,"hi.txt");//在file3下面的 hi.txt的文件,C:\Users\13370\java_demo1\hi.txt
        System.out.println(file4);
    }
    @Test
    public void test2(){
        File file1 = new File("Hello.txt");
        File file2 = new File("D:\\BaiduNetdiskDownload\\Java自动化\\Java全栈\\2.Java基础\\7.八大基本类型变量.mp4");
        System.out.println(file1.getAbsolutePath());//完整路径//C:\Users\13370\Desktop\java_demo1\automationtest\Hello.txt
        System.out.println(file1.getPath());//获取路径//Hello.txt
        System.out.println(file1.getName());//获取名称//Hello.txt
        System.out.println(file1.getParent());//上层文件目录结构。若无，返回null//null
        System.out.println(file1.length());//长度(字节)//0
        System.out.println(new Date(file1.lastModified()));//最近的修改时间(毫秒)//0
        System.out.println();
        System.out.println(file2.getAbsolutePath());//D:\BaiduNetdiskDownload\Java自动化\Java全栈\2.Java基础\7.八大基本类型变量.mp4
        System.out.println(file2.getPath());//D:\BaiduNetdiskDownload\Java自动化\Java全栈\2.Java基础\7.八大基本类型变量.mp4
        System.out.println(file2.getName());//7.八大基本类型变量.mp4
        System.out.println(file2.getParent());//D:\BaiduNetdiskDownload\Java自动化\Java全栈\2.Java基础
        System.out.println(file2.length());//221216318
        System.out.println(new Date(file1.lastModified()));//1602937973845
    }
    @Test
    public void test3(){
        File file = new File("C:\\Users\\13370\\Desktop");
        String[] list = file.list();//获取指定目录下所有文件或文件目录的名称数组
        for(Object oj : list){
            System.out.println(oj);
        }
        File[] files = file.listFiles();//获取指定目录下的所有文件或者文件目录的File数组
        for(Object o : files){
            System.out.println(o);
        }
    }
    @Test
    public void test4(){
        /**
         * public boolean isDirectory():判断是否是文件目录
         * public boolean isFile():判断是否是文件
         * public boolean exists():判断是否存在
         * public boolean canRead():判断是否可读
         * public boolean canWrite():判断是否可写
         * public boolean isHidden():判断是否可隐藏
         */
        File file1 = new File("D:\\BaiduNetdiskDownload\\Java自动化\\Java全栈\\2.Java基础\\7.八大基本类型变量.mp4");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
        System.out.println();
        File file2 = new File("D:\\BaiduNetdiskDownload\\Java自动化");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());
    }
    @Test
    public void test6() throws IOException {
        /*
        创建硬盘中对应的文件或文件目录
        public boolean createNewFile():创建文件。若文件存在，则不创建，返回false
        public boolean mkdir():创建文件目录。如果此文件目录存在，就不创建了。如果次文件目录的上层
        public boolean mkdirs():创建文件目录。如果上层文件目录不存在，一并创建
        public boolean delete():删除文件或者文件夹
            删除注意事项:
                java中的删除不走回收站
         */
        File file1 = new File("C:\\Users\\admin\\Desktop\\cloud-user-更新用户接口V2.pdf");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }if(file1.exists()){
            file1.delete();
            System.out.println("删除文件");
        }
    }
    @Test
    public void test5(){
        File file1 = new File("d:\\io\\io1");
        boolean mkdirs = file1.mkdirs();
        if(mkdirs){
            System.out.println("创建成功1");
        }
        File file2 = new File("d:\\io\\io2");
        boolean mkdir = file2.mkdir();
        if(mkdir){
            System.out.println("创建成功2");
        }
    }
}
