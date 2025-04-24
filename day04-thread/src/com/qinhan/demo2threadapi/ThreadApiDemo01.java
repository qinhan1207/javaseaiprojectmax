package com.qinhan.demo2threadapi;

public class ThreadApiDemo01 {
    public static void main(String[] args) {
        // 目标：搞清楚线程的常用方法

        Thread t1 = new MyThread("1号线程");
        //t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号线程");
        //t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName());

        // 哪个线程调用这个代码，这个代码就拿到哪个线程
        Thread m = Thread.currentThread();  // 主线程
        m.setName("主线程");
        System.out.println(m.getName());    // main
    }
}

class MyThread extends Thread{
    public MyThread(String name){
        super(name); // 调用父类构造器
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程:"+i);
        }
    }
}


