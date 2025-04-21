package com.qinhan.demo1file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        // 目标：File创建对象代表文件（文件/目录），搞清楚其提供的对文件进行操作的方法。
        // 1.创建File对象去获取某个文件的信息
        File f1 = new File("D:/kubernetes学习/通过kind搭建集群.docx");
        System.out.println(f1.length());
        System.out.println(f1.getName());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());

        // 2.可以使用相对路径定位文件对象
        // 只要带盘符的都称为：绝对路径 D:/kubernetes学习/通过kind搭建集群.docx
        // 相对路径：不带盘符，默认是到你的idea工程下直接寻找文件的。一般用来找工程下的项目文件的
        File f2 = new File("day03-file-io/src/haha.txt");
        System.out.println(f2.length());
        System.out.println(f2.getAbsolutePath());

        // 3.创建对象代表不存在的文件对象
        File f3 = new File("D:/kubernetes学习/aaa.txt");
        System.out.println(f3.createNewFile());

        //4.创建对象代表不存在的文件夹路径
        File f4 = new File("D:/kubernetes学习/aaa");
        System.out.println(f4.mkdir());

        File f5 = new File("D:/kubernetes学习/bbb/ccc/dd");
        System.out.println(f5.mkdirs());

        // 5.创建File对象代表存在的文件，然后删除它
        File f6 = new File("D:/kubernetes学习/aaa.txt");
        System.out.println(f6.delete());

        // 6.创建File对象代表存在的文件夹，然后删除它
        File f7 = new File("D:/kubernetes学习/aaa");
        System.out.println(f7.delete()); // 只能删除空文件

        File f8 = new File("D:/kubernetes学习/bbb");
        System.out.println(f8.delete()); // 不能删除非空文件

        // 7.可以获取某个目录下的一级文件名称
        File f9 = new File("D:/kubernetes学习");
        String[] list = f9.list();
        System.out.println(Arrays.toString(list));

        // 8.获取当前目录下所有一级文件对象到一个文件对象数组中去返回（重点）
        File[] files = f9.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}
