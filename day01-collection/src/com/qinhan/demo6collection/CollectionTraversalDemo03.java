package com.qinhan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo03 {
    public static void main(String[] args) {
        // 目标：掌握Collection的遍历方式一：迭代器便利
        Collection<String> names = new ArrayList<>();
        names.add("赵敏");
        names.add("周芷若");
        names.add("小昭");
        names.add("张无忌");
        names.add("玄冥二老");
        names.add("殷素素");
        System.out.println(names); // [赵敏, 周芷若, 小昭, 张无忌, 玄冥二老, 殷素素]
        //                              it
        // 1.得到这个集合的迭代器对象
        Iterator<String> it = names.iterator();
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());

        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }
    }
}
