package com.qinhan.demo1exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo05 {
    public static void main(String[] args) {
        // 目标：掌握异常的处理方案1:底层异常抛出去给最外层调用者，记录异常，相应适合信息给用户看。
        System.out.println("程序开始");


        try {
            method();
            System.out.println("这次操作成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("这次操作失败了");
        }

        System.out.println("程序结束");
    }

    public static void method() throws Exception {
        String str = "2025-04-13 19:39:26";
        // 把字符串转换为日期类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf.parse(str); // 编译时异常，提醒程序员这里的程序很容易出现错误，请您注意！
        System.out.println(date);

        InputStream is = new FileInputStream("D:/meinv.png");

    }
}
