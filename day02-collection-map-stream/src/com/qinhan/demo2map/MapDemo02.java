package com.qinhan.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("嫦娥",20);
        map.put("嫦娥", 28);
        map.put("女儿国王",31);
        map.put("铁扇公主",48);
        map.put("紫霞",31);
        map.put(null,null);

        System.out.println(map);
    }
}
