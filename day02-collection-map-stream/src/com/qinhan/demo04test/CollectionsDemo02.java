package com.qinhan.demo04test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo02 {
    public static void main(String[] args) {
        // 目标：Collections工具类
        List<String> list = new ArrayList<>();
        // 1.批量添加数据
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        System.out.println(list);

        // 2.打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
