package com.qinhan.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo04 {
    public static void main(String[] args) {
        // 掌握Map集合的遍历方式二：键值对
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥",20);
        map.put("嫦娥",28);
        map.put("女儿国王",31);
        map.put("铁扇公主",48);
        map.put("紫霞",31);
        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"===>"+value);
        }
    }
}
