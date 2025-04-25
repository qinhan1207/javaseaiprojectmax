package com.qinhan.demo6_lock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lk = new ReentrantLock();    // 加final关键词来保护锁对象

    // 小明和小红都到这里来取钱
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lk.lock();  // 上锁
        try {
            // 判断余额是否足够
            if (this.money>=money){
                System.out.println(name+"取钱成功，取了"+money+"元");
                this.money-=money;
                System.out.println(name+"取钱成功，余额为"+this.money);
            }else {
                System.out.println(name+"取钱失败，余额不足");
            }
        } finally {
            lk.unlock();
        }
    }
}
