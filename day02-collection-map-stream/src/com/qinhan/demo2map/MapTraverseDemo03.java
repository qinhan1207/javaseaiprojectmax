package com.qinhan.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo03 {
    public static void main(String[] args) {
        // 掌握Map集合的遍历方式一：先将map的所有键提取出来，然后再根据键来遍历值
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥",20);
        map.put("嫦娥",28);
        map.put("女儿国王",31);
        map.put("铁扇公主",48);
        map.put("紫霞",31);
        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }
    }
}
