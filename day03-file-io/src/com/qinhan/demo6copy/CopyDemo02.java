package com.qinhan.demo6copy;

import java.io.*;

public class CopyDemo02 {
    public static void main(String[] args) {
        // 目标：关闭资源的新方式：try-with-resource
        // 源文件：D:\resources\gd.jpeg
        // 目标：D:\resources\gd_copy.jpeg (复制过去的时候必须带文件名的，无法自动生成文件名）
        copyFile("D:\\resources\\gd.jpeg", "D:\\resources\\gd_copy.jpeg");
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath) {
        // 1.创建一个文件字节输入流管道与源文件接通
        try (
                // 这里只能放置资源对象，用完后最终会自动调用其close方法关闭！！
                // 什么是资源？实现了Closeable接口或AutoCloseable接口
                InputStream is = new FileInputStream(srcPath);
                OutputStream os = new FileOutputStream(destPath);
                MyConn conn = new MyConn(); // 自定义的资源对象，最终会调用close方法来关闭
        ) {
            // 2.读取一个字节数组，写入一个字节数组
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len); // 读取多少个字节，就写入多少个字节
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConn implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("qinhan的资源关闭了");
    }
}
