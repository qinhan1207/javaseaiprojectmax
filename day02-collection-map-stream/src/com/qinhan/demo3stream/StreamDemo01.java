package com.qinhan.demo3stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo01 {
    public static void main(String[] args) {
        // 目标：认识Stream流，掌握其基本使用
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 1.先用传统方案：找到姓张的人，名字为3个字的，存入到一个新集合中去
        List<String> newList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                newList.add(name);
            }
        }
        System.out.println(newList);

        // 2.使用Stream流来解决
        List<String> newList2 = list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
