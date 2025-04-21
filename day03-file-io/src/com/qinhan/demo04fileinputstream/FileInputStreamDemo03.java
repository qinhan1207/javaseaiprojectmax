package com.qinhan.demo04fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        // 1.创建文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("day03-file-io/src/qinhan04.txt");

        // 2.一次性读完文件的全部字节，可以避免读取汉字输出乱码的问题
        byte[] bytes = is.readAllBytes();

        String s = new String(bytes);
        System.out.print(s);
        is.close();

    }
}
