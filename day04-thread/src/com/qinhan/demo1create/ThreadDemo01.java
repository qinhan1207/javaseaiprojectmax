package com.qinhan.demo1create;

public class ThreadDemo01 {
    // main方法本身是有一条主线程负责推荐执行的
    public static void main(String[] args) {
        // 目标：认识多线程，掌握创建多线程的方式一，继承thread类
        // 4.创建线程类的对象：代表线程
        Thread mt = new MyThread();
        // 5.调用start方法，启动线程。还是调用run方法执行的
        mt.start(); // 启动线程，让线程执行run方法

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出"+i);
        }
    }
}

// 1.定义一个子类来继承Thread类
class MyThread extends Thread {
    // 2.重写Thread类的run方法
    @Override
    public void run() {
        // 3.在run方法中编写线程的任务代码（线程要干的活）
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}