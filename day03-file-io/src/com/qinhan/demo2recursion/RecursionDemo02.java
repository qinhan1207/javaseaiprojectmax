package com.qinhan.demo2recursion;

public class RecursionDemo02 {
    public static void main(String[] args) {
        // 计算n的阶乘
        System.out.println(f(5));

        System.out.println(f2(5));
    }

    public static int f(int n){
        if (n==1) {
            return 1;
        }
        return f(n-1)*n; // 递归调用
    }

    // 求前n项的和
    public static int f2(int n){
        if (n==1){
            return 1;
        }
        return f2(n-1)+n;
    }
}
