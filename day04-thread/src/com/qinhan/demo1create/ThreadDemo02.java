package com.qinhan.demo1create;

public class ThreadDemo02 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：通过实现Runnable接口来创建
        // 3.创建线程任务类的对象代表一个线程任务
        Runnable r = new MyRunnable();
        // 4.把线程任务对象交给一个线程对象处理
        Thread t1 = new Thread(r);
        // 5.启动线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出"+i);
        }
    }
}

// 1.定义一个线程任务类实现Runnable接口
class MyRunnable implements Runnable{
    // 2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出"+i);
        }
    }
}
