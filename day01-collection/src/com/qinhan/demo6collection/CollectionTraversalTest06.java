package com.qinhan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalTest06 {
    public static void main(String[] args) {
        // 目标：认识并发修改异常问题，搞清楚每种遍历的区别
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");
        System.out.println(list);

        // 需求：删除全部枸杞

        /**
         * 第一种，出现并发异常情况，并不能删干净出现枸杞的元素
         */
        //for (int i = 0; i<list.size();i++){
        //    String name = list.get(i);
        //    if (name.contains("枸杞")){
        //        list.remove(name);
        //    }
        //}
        //System.out.println(list); // [Java入门, 黑枸杞, 人字拖, 枸杞子, 西洋参]
        System.out.println("==============================");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        list2.add("西洋参");
        System.out.println(list2);

        // 需求：删除全部枸杞

        for (int i = 0; i<list2.size();i++){
            String name = list2.get(i);
            if (name.contains("枸杞")){
                list2.remove(name);
                // 解决方案一：在删除完之后做i--操作
                i--;
            }
        }
        System.out.println(list2);
        System.out.println("=======================");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("特级枸杞");
        list3.add("枸杞子");
        list3.add("西洋参");
        System.out.println(list3);

        // 需求：删除全部枸杞
        // 解决方案二：倒着遍历并删除
        for (int i = list3.size()-1;i>0;i--){
            String name = list3.get(i);
            if (name.contains("枸杞")){
                list3.remove(name);
            }
        }
        System.out.println(list3);

        System.out.println("=======================");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Java入门");
        list4.add("宁夏枸杞");
        list4.add("黑枸杞");
        list4.add("人字拖");
        list4.add("特级枸杞");
        list4.add("枸杞子");
        list4.add("西洋参");
        System.out.println(list4);

        // 需求：删除全部枸杞
        // 方案1.迭代器遍历并删除默认也存在并发修改异常问题
        // 可以解决3：使用迭代器自己的方法来删除
        Iterator<String> it = list4.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("枸杞")){
                it.remove();
            }
        }
        System.out.println(list4);

        System.out.println("=======================");
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Java入门");
        list5.add("宁夏枸杞");
        list5.add("黑枸杞");
        list5.add("人字拖");
        list5.add("特级枸杞");
        list5.add("枸杞子");
        list5.add("西洋参");
        System.out.println(list5);

        // 需求：删除全部枸杞
        // 方案二和三：用增强for和lambda（都没有办法解决并发修改异常问题）
        //for (String name : list5) {
        //    if (name.contains("枸杞")){
        //        list5.remove(name);
        //    }
        //}

        //list5.forEach(s->{
        //    if (s.contains("枸杞")){
        //        list5.remove(s);
        //    }
        //});
        //System.out.println(list5);

    }
}
