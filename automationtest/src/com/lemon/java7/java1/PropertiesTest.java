package com.lemon.java7.java1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author shkstart
 * @create 2020--12--01--20:58
 */
public class PropertiesTest {
    //properties:常用来处理配置文件。key和value都是String类型
    public static void main(String[] args){

        FileInputStream fis = null;
        try {
            Properties pro = new Properties();
            fis = new FileInputStream("D:\\metaapp\\java_demo1\\automationtest\\jdbc.properties");

            pro.load(fis);//加载流对应得文件
            String name = pro.getProperty("name");
            String password = pro.getProperty("password");
            System.out.println(name+ "+" + "+" +password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
