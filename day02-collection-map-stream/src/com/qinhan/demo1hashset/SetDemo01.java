package com.qinhan.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {
    public static void main(String[] args) {
        // 目标：认识Set家族集合的特点
        // 1.创建一个Set集合，
        //Set<String> set = new HashSet<>(); // HashSet特点：无序，不重复，无索引
        Set<String> set = new LinkedHashSet<>(); // LinkedHashSet特点：有序，不重复，无索引
        set.add("java");
        set.add("java");
        set.add("鸿蒙");
        set.add("新媒体");
        set.add("大数据");
        set.add("大数据");
        set.add("C++");
        System.out.println(set);

        System.out.println("====================");

        // 2.创建一个TreeSet集合：可排序(默认一定要大小升序排序），不重复，无索引
        Set<Double> set1 = new TreeSet<>();
        set1.add(3.14);
        set1.add(3.14);
        set1.add(3.15);
        set1.add(10.0);
        set1.add(3.6);
        set1.add(3.6);
        set1.add(2.8);
        set1.add(1100.22);
        System.out.println(set1);
    }
}
