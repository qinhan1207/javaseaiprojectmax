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
}
