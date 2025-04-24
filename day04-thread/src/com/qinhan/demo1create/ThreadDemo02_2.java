package com.qinhan.demo1create;

public class ThreadDemo02_2 {
    // 目标：掌握多线程的创建方式二：通过实现Runnable接口的匿名内部类来创建
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线1程输出"+i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2输出"+i);
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程3输出"+i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出"+i);
        }
    }
}
