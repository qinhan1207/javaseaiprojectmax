package com.qinhan.demo1exception;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        // 目标 ：搞清楚异常的作用
        System.out.println("程序开始");
        try {
            System.out.println(div(10, 0));
            System.out.println("底层方法执行成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败了");
        }
        System.out.println("程序结束");
    }

    // 需求：求两个数除的结果，并返回
    public static int div(int a, int b) throws Exception {
        if(b==0){
            System.out.println("除数不能为0，您的参数有问题");
            // 可以返回一个异常给上层调用，返回的异常还可能告知上层底层是执行成功了还是执行失败了
            throw new Exception("除数不能为0，您的参数有问题");
        }
        int result = a / b;
        return result;
    }
}
