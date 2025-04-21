package com.qinhan.demo6collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTraversalDemo06 {
    public static void main(String[] args) {
        // 目标：三种遍历方式
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("西洋参");

        // 需求：删除全部枸杞
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=================");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==================");

        list.forEach(s-> System.out.println(s));
    }
}
