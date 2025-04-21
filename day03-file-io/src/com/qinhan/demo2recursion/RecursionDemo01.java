package com.qinhan.demo2recursion;

public class RecursionDemo01 {
    public static void main(String[] args) {
        // 目标：认识递归
        printA();
    }

    public static void printA(){
        System.out.println("A执行了");
        printA();
    }

    // 学习git，解决冲突
    public static void print01(){
        System.out.println("我在学习git");
    }

    public static void print04(){
        System.out.println("添加print04功能");
    }
}
