package com.qinhan.demo2recursion;

public class RecursionDemo03 {
    public static void main(String[] args) {
        // 递归解决猴子吃桃问题
        System.out.println(f(1));

    }
    public static int f(int n){
        if (n==10){
            return 1;
        }
        return 2*f(n+1)+2;
    }
}
