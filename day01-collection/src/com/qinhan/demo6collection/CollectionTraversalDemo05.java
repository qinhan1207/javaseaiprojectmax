package com.qinhan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTraversalDemo05 {
    public static void main(String[] args) {
        // 目标：掌握Collection的遍历方式三：lambda遍历
        Collection<String> names = new ArrayList<>();
        names.add("赵敏");
        names.add("周芷若");
        names.add("小昭");
        names.add("张无忌");
        names.add("玄冥二老");
        names.add("殷素素");

        //names.forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String string) {
        //        System.out.println(string);
        //    }
        //});

        names.forEach(s-> System.out.println(s));
    }
}
