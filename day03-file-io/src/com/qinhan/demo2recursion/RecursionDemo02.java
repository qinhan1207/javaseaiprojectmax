package com.qinhan.demo2recursion;

public class RecursionDemo02 {
    public static void main(String[] args) {
        // 计算n的阶乘
        System.out.println(f(5));
    }

    public static int f(int n){
        if (n==1) {
            return 1;
        }
        return f(n-1)*n; // 递归调用
    }
}
