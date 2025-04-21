package com.qinhan.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 掌握HashSet集合去重操作
        Student s1 = new Student("小明", 18, "上海", "123456");
        Student s2 = new Student("小红", 18, "北京", "852852");
        Student s3 = new Student("小红", 18, "北京", "852852");
        Student s4 = new Student("小明", 18, "上海", "123456");

        Set<Student> set = new HashSet<>(); // 不重复的！
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
