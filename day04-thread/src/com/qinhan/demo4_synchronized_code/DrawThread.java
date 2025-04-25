package com.qinhan.demo4_synchronized_code;

public class DrawThread extends Thread {

    private Account acc;    // 记住线程对象要处理的账户对象


    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 取钱
        acc.drawMoney(100000);
    }
}
