package com.qinhan.demo5genericity;

import java.util.ArrayList;

public class GenericDemo06 {
    public static void main(String[] args) {
        // 目标：搞清楚泛型和集合不支持基本数据类型，只能支持对象类型（引用数据类型）
        //ArrayList<int> = new ArrayList<>();
        // 泛型擦除：泛型工作在编译阶段，等编译后泛型就没用了，所以泛型在编译后会擦除。所有类型会恢复成Object

        // 把基本数据类型变成包装类对象
        // 手工包装：
        // Integer i = new Integer(9);
        Integer id1 = Integer.valueOf(100);
        Integer id2 = Integer.valueOf(100);
        System.out.println(id1==id2);

        // 自动装箱成对象：基本数据类型的数据可以直接变成包装对象的数据，不需要额外做任何事情
        Integer it1 = 130;
        Integer it2 = 130;
        System.out.println(it2==it1);

        // 自动拆箱：把包装类型的对象直接给基本类型的数据
        int i = it1;
        System.out.println(i);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(123); // 自动装箱
        list.add(120);

        int id = list.get(1); // 自动拆箱
        System.out.println("-------------------------------------");

        // 包装类新增的功能
        // 1.把基本类型的数据转换为字符串
        int j = 23;
        String rs1 = Integer.toString(j);

        System.out.println("-------------------------------------");

        // 2.把字符串数值转换成对应的基本数据类型（很有用）
        String str = "98";
        //int age = Integer.parseInt(str);
        int age = Integer.valueOf(str);
        System.out.println(age+2);

        String str2 = "98.8";
        double age2 = Double.valueOf(str2);
        System.out.println(age2+1.3);

    }
}
