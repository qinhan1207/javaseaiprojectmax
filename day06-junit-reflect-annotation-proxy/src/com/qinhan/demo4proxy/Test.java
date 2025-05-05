package com.qinhan.demo4proxy;

public class Test {
    public static void main(String[] args) {
        // 目标：准备代理对象
        // 1.准备一个明星对象：设计明星类
        Star star = new Star("章若楠");
        // 2.为章若楠创建一个专属的代理对象。
        StarService proxy = ProxyUtils.createProxy(star);
        proxy.sing("红昭愿");
        System.out.println(proxy.dance());
    }
}
