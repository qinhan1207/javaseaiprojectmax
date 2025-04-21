package com.qinhan.demo10bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderDemo01 {
    public static void main(String[] args) {
        // 目标：搞清楚缓冲字符输入流读字符内容：性能提升了，多了按照行读取文本的能力
        try (
                // 1.创建文件字符输入流与源文件接通
                Reader fr = new FileReader("day03-file-io/src/qinhan08.txt");
                // 2.创建缓冲字符输入流包装低级的字符输入流
                BufferedReader br = new BufferedReader(fr);
        ) {
            //char[] buffer = new char[1024];
            //int len;
            //while ((len=br.read(buffer))!=-1){
            //    String str = new String(buffer,0,len);
            //    System.out.print(str);
            //}

            //System.out.println(br.readLine());
            //System.out.println(br.readLine());
            //System.out.println(br.readLine());
            //System.out.println(br.readLine());
            //System.out.println(br.readLine());

            // 使用循环改进，来按照行读取数据
            // 定义一个字符串变量用于记住每次读取的一行数据
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            // 目前读取文本最优雅的方案：性能好，不乱码，可以按行读取。
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
