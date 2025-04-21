package com.qinhan.demo1exception;

public class ExceptionDemo04 {
    public static void main(String[] args) {
        // 认识自定义运行时异常

        System.out.println("程序开始");

        try {
            saveAge(320);
            System.out.println("成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败了");
        }


        System.out.println("程序结束");
    }

    public static void saveAge(int age) {
        if (age<1||age>200){
            throw new AgeIllegalRuntimeException("年龄非法，age需要>1并且小于200");
        }else {
            System.out.println("年龄保存成功");
        }
    }
}
