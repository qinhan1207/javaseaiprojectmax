package com.qinhan.demo2recursion;

import java.io.File;
import java.io.IOException;

public class FileSearchTest04 {
    public static void main(String[] args) {
        // 目标：完成文件搜索：找出D盘下的QQ.exe的位置
        try {
            File dir = new File("D:/");
            search(dir, "QQ.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 搜索文件
     *
     * @param dir      搜索的目录
     * @param fileName 搜索的文件的名称
     */
    public static void search(File dir, String fileName) throws Exception {
        // 1.判断极端情况
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        // 2.获取目录下的所有一级文件及文件夹对象
        File[] files = dir.listFiles();

        // 3.判断当前目录下是否存在一级对象文件，存在才可以遍历
        if (files != null && files.length > 0) {
            // 4.遍历一级文件对象
            for (File file : files) {
                // 5.判断一级文件对象是否是文件
                if (file.isFile()) {
                    // 6.判断文件名是否是要找的文件名
                    if (file.getName().contains(fileName)) {
                        System.out.println("找到目标文件" + file.getAbsolutePath());
                        // 8.如果找到了，则调用Runtime的exec方法打开文件
                        Runtime r = Runtime.getRuntime();
                        r.exec(file.getAbsolutePath());
                    }
                } else {
                    // 7.如果一级文件对象时文件夹，则递归调用
                    search(file, fileName);
                }
            }
        }

    }
}
