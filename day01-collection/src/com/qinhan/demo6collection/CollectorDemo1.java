package com.qinhan.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectorDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚Collection集合的整体特点
        // 1.List家族的集合：有序，可重复，有索引
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("C++");
        list.add("python");
        list.add("golang");
        System.out.println(list);
        System.out.println(list.get(0));
        // Set家族的集合：无序、不可重复、无索引
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("C++");
        set.add("python");
        set.add("golang");
        System.out.println(set);
    }
}
