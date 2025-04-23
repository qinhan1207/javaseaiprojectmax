package com.qinhan.demo11bufferedWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedTest2 {
    public static void main(String[] args) {
        try (
                // 1.定义一个缓冲字符输入流管道与源文件接通
                BufferedReader br = new BufferedReader(new FileReader("day03-file-io/src/csb.txt"));
                // 6.定义一个缓冲字符输出流管道与目标文件连接
                BufferedWriter bw = new BufferedWriter(new FileWriter("day03-file-io/src/csb_out.txt"));
        ) {
            // 2.提前准备一个List集合存储每段内容
            List<String> list = new ArrayList<>();
            // 3.按行读取数据，加入到data集合中
            String line;
            while ((line = br.readLine())!=null){
                list.add(line);
            }
            // 4.给集合中的每段内容，按照首字母排序
            //list.sort((o1, o2) -> o1.charAt(0)-o2.charAt(0));
            Collections.sort(list);
            System.out.println(list);
            // 5.遍历结合，将每段内容写到目标文件
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
