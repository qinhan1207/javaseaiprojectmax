package com.qinhan.demo1exception;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            saveAge(320);
            System.out.println("成功了");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("失败了");
        }
        System.out.println("程序结束");
    }

    public static void saveAge(int age) throws AgeIllegalException {
        if (age<1||age>200){
            throw new AgeIllegalException("年龄保存失败,age 不能小于1或者大于200");
        }else {
            System.out.println("年龄保存成功");
        }
    }
}
