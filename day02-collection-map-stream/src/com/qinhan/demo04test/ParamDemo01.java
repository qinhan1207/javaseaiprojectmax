package com.qinhan.demo04test;

import java.util.Arrays;

public class ParamDemo01 {
    public static void main(String[] args) {
        // 目标：可变参数
        sum();
        sum(1);
        sum(1,2,3,4,5,6);
        sum(new int[]{2,3,4,5,6});

        // 优势：接收参数很灵活，可以代替数组传参
    }

    // 注意事项：可变参数在形参列表中只能有一个，可变参数必须放在形参列表的最后面
    public static void sum(int...nums){
        // 内部怎么拿数据
        // 可变参数对内实际上就是一个数组。nums就是数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("---------------");
    }
}
