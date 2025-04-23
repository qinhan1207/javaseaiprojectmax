package com.qinhan.demo13printstream;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo01 {
    public static void main(String[] args) {
        // 目标：打印流的使用
        try (
                //PrintStream ps = new PrintStream("day03-file-io/src/ps.txt");
                PrintWriter ps = new PrintWriter("day03-file-io/src/ps.txt");
        ) {
            ps.println(97);
            ps.println('a');
            ps.println("秦晗");
            ps.println(true);
            ps.println(99.9);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
