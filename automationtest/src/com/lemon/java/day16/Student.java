package com.lemon.java.day16;

public class Student {
    public static void main(String[] args) {
        StudentTest s = new StudentTest();
        try {
            s.regist(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
class StudentTest{
    private int id;
    public void regist(int id) throws MyException {
        if(id > 0){
            this.id = id;
        }else{
            // System.out.println("非法");
            //手动抛出异常对象
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "id=" + id +
                '}';
    }
}
