package com.qinhan.demo2map;

import com.qinhan.demo1hashset.Teacher;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo07 {
    public static void main(String[] args) {
        // 目标：TreeMap集合(原理和用法与TreeSet一样）
        Map<Teacher,String> map = new TreeMap<>((o1, o2) -> Double.compare(o2.getSalary(),o1.getSalary()));
        map.put(new Teacher("张三", 30, 6232.4),"462期");
        map.put(new Teacher("李四", 28, 3999.5),"422期");
        map.put(new Teacher("王五", 35, 9999.9),"461期");
        map.put(new Teacher("赵六", 30, 8888.8),"423期");

        System.out.println(map);
    }
}
