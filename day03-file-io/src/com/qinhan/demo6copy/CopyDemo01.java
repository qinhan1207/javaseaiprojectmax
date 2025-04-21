package com.qinhan.demo6copy;

import java.io.*;

public class CopyDemo01 {
    public static void main(String[] args) {
        // 目标：使用字节流完成文件的复制操作。
        // 源文件：D:\resources\gd.jpeg
        // 目标：D:\resources\gd_copy.jpeg (复制过去的时候必须带文件名的，无法自动生成文件名）
        copyFile("D:\\resources\\gd.jpeg", "D:\\resources\\gd_copy.jpeg");
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // 1.创建一个文件字节输入流管道与源文件接通
            is = new FileInputStream(srcPath);
            // 2.创建一个文件字节输出流管道与目标文件接通
            os = new FileOutputStream(destPath);
            // 3.读取一个字节数组，写入一个字节数组
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len); // 读取多少个字节，就写入多少个字节
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 最后一定会执行一次，即便程序会出现异常！
            // 4.释放资源
            try {
                if (os != null) os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (is != null) is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
