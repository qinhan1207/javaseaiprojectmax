package com.qinhan.demo7list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        // 目标：掌握list集合系列独有的功能
        List<String> names = new ArrayList<>();

        // 添加数据
        names.add("小明");
        names.add("小红");
        names.add("小刚");
        names.add("小花");
        System.out.println(names);

        // 给指定位置插入一个数据
        names.add(2,"赵敏");
        System.out.println(names);

        // 删除小红
        System.out.println(names.remove(1));    // 根据下标删除，返回删除的数据
        System.out.println(names);

        // 将小明修改为金毛
        System.out.println(names.set(0, "金毛")); // 根据下标修改，返回修改前的数据
        System.out.println(names);

    }
}
