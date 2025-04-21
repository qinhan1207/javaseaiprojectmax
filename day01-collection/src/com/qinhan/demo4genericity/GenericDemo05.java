package com.qinhan.demo4genericity;

import java.util.ArrayList;

public class GenericDemo05 {
    public static void main(String[] args) {
        // 目标：理解通配符和上下限
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);
    }
    // 需求：开发一个极品飞车的游戏
    // 虽然Xiaomi和BYD都是Car的子类，但是ArrayList<Xiaomi>和ArrayList<BYD>与ArrayList<Car>没有任何关系！
    public static void go(ArrayList<? extends Car> cars){

    }

}
