package com.qinhan.demo4_synchronized_code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId;
    private double money;

    // 小明和小红都到这里来取钱
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        // 判断余额是否足够
        synchronized (this) {
            if (this.money>=money){
                System.out.println(name+"取钱成功，取了"+money+"元");
                this.money-=money;
                System.out.println(name+"取钱成功，余额为"+this.money);
            }else {
                System.out.println(name+"取钱失败，余额不足");
            }
        }
    }
}
