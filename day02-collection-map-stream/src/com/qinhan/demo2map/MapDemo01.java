package com.qinhan.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        // 目标：认识Map集合的体系特点
        // 1.创建map集合
        // HashMap特点：无序，不重复，无索引，价值对都可以为null，值不做要求
        //Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new LinkedHashMap<>();
        // LinkedHashMap特点：有序，不重复，无索引，价值对都可以为null，值不做要求
        // TreeMap特点：按照键可排序，不重复，无索引，价值对都可以为null，值不做要求

        map.put("嫦娥",20);
        map.put("嫦娥",28);
        map.put("女儿国王",31);
        map.put("铁扇公主",48);
        map.put("紫霞",31);
        map.put(null,null);

        System.out.println(map);
    }
}
