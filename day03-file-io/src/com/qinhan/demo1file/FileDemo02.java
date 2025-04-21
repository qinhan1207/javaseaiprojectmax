package com.qinhan.demo1file;

import java.io.File;
import java.util.Arrays;

public class FileDemo02 {
    public static void main(String[] args) {
        // 目标：掌握File遍历一级文件对象的操作

        /**
         * 当主调是文件，或者路径不存在时，返回null
         * 当主调是空文件夹时，返回一个长度为0的数组
         * 当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回
         * 当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
         * 当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
         */

        File dir = new File("D:/qinhan.txt");
        File[] files = dir.listFiles();
        System.out.println(Arrays.toString(files));

        File dir2 = new File("D:\\kubernetes学习\\bbb\\ccc\\dd");
        File[] files1 = dir2.listFiles();
        System.out.println(Arrays.toString(files1));

    }
}
