package com.qinhan.demo1exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo01 {
    // 认识异常的体系，搞清楚异常的作用

    public static void main(String[] args) {
        //method();

            // 监视代码，出现异常，会被catch拦截住这个异常
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 定义一个方法认识运行时异常
    public static void method() {
        System.out.println("程序开始");
        // 运行时异常的特点：编译时不报错，运行时才会报错，继承自 RuntimeException
        int[] arr = new int[10];
        //System.out.println(arr[10]); // ArrayIndexOutOfBoundsException

        //System.out.println(10/0); // ArithmeticException

        // NullPointerException
        String str = null;
        System.out.println(str);
        System.out.println(str.length());

        System.out.println("程序结束");

    }

    // 定义一个方法，认识编译时异常
    public static void method2() throws Exception {
        // 编译异常：编译阶段报错，代码不通过
        System.out.println("程序开始");
        String str = "2025-04-13 19:39:26";
        // 把字符串转换为日期类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str); // 编译时异常，提醒程序员这里的程序很容易出现错误，请您注意！
        System.out.println(date);

        InputStream is = new FileInputStream("D:/meinv.png");

        System.out.println("程序结束");
    }
}
