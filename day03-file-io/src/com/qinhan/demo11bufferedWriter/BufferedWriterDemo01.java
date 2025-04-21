package com.qinhan.demo11bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo01 {
    public static void main(String[] args) {
        // 掌握缓冲字符输出流的使用：提升了字符输出流的写数据的性能，多了换行功能

        try (
                // 1.创建一个字符输出流对象，指定写出的目的地
                Writer fw = new FileWriter("day03-file-io/src/qinhan07-out.txt",true);
                // 2.创建一个缓冲字符输出流对象，把字符输出流作为构造参数传递给缓冲字符输出流对象
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write( 97);
            bw.write('b');
            bw.write('秦');
            // 新增的换行方法
            bw.newLine();

            bw.write("明明如月，何时可掇");
            bw.write("忧从中来，不可断绝");
            bw.write("\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
