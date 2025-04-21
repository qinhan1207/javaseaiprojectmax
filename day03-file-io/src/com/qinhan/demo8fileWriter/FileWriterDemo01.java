package com.qinhan.demo8fileWriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo01 {
    public static void main(String[] args) {
        // 目标：搞清楚文件字符输出流的使用：写字符出去的流
        // 1.创建一个字符输出流对象，指定写出的目的地
        try (
                //Writer fw = new FileWriter("day03-file-io/src/qinhan07-out.txt") // 覆盖管道
                Writer fw = new FileWriter("day03-file-io/src/qinhan07-out.txt",true) // 追加数据

        ) {
            // 2.写一个字符进去
            fw.write(97);
            fw.write('b');
            fw.write('秦');
            fw.write("\r\n");

            // 3.写一个字符串
            fw.write("你好呀");
            fw.write("明明如月，何时可掇");
            fw.write("\r\n");

            // 4.写字符串的一部分出去
            fw.write("明明如月", 1, 3);
            fw.write("\r\n");

            // 5.写一个字符数组
            fw.write("java".toCharArray());
            fw.write("\r\n");

            // 6.写字符数组的一部分
            fw.write("java".toCharArray(), 1, 2);
            fw.write("\r\n");

            //fw.flush(); // 刷新缓冲区，将缓冲区的数据全部写出去。
            // 刷新后，流可以继续使用
            //fw.close(); // 关闭资源，关闭包含了刷新！关闭后流不能继续使用！

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
