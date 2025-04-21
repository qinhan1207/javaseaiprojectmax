package com.qinhan.demo5fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 目标：学会使用文件字节输出流
        // 1.创建文件字节输出流管道与目标文件接通
        //OutputStream os = new FileOutputStream("day03-file-io/src/qinhan05-out.txt"); //覆盖管道
        OutputStream os = new FileOutputStream("day03-file-io/src/qinhan05-out.txt",true);   // 追加数据

        // 2.写入数据
        os.write(97);   // 写入一个字节数据
        os.write('b');  // 写入一个字符数据
        //os.write('秦');  // 写入一个字符数据，会乱码，write写一个字节进去，但是汉字为3在utf-8编码下为3个字节
        os.write("\r\n".getBytes());    // 换行

        // 3.写一个字节数组出去
        byte[] bytes = "我爱你中国".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes());

        // 4.写一个字节数组的一部分出去
        os.write(bytes, 0, 3);
        os.write("\r\n".getBytes());

        os.close(); // 关闭管道 释放资源
    }
}
