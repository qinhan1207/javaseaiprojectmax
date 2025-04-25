package com.qinhan.demo6_lock;

public class ThreadDemo01 {
    public static void main(String[] args) {
        // 目标：模拟线程安全问题
        // 1.设计一个账户类，用于创建小明和小红的共同账户对象，存入100000元
        Account acc = new Account("ICBC-110",100000);

        // 2.设计线程类，创建小明和小红两个线程，模拟小红和小明同时去一个账户取款100000
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();
    }
}
