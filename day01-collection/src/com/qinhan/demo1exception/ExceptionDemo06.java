package com.qinhan.demo1exception;

import java.util.Scanner;

public class ExceptionDemo06 {
    public static void main(String[] args) {
        // 掌握异常的处理方案2：最外层捕获异常后，尝试重新修复
        // 接收用户的一个定价
        System.out.println("程序开始");

        while (true) {
            try {
                double price = userInputPrice();
                System.out.println("用户成功设置了定价"+price);
                break;

            } catch (Exception e) {
                System.out.println("请输入正确的价格");
            }
        }

        System.out.println("程序结束");
    }

    public static double userInputPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入商品的定价");
        double price = sc.nextDouble();
        return price;
    }
}
