package com.qinhan.demo12inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo02 {
    public static void main(String[] args) {
        // 使用字符输入转换流InputStreamReader解决不同编码读取乱码的问题

        try (
                // 先提取文件的原始字节流
                InputStream fis = new FileInputStream("day03-file-io/src/qinhan09.txt");
                // 指定编码，将字节流转换为字符输入流
                InputStreamReader isr = new InputStreamReader(fis, "GBK");
                // 创建字符缓冲输入流包装低级的字符输入流
                BufferedReader br = new BufferedReader(isr);


        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
