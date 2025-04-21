package com.qinhan.demo2map;

import java.util.*;

public class MapTest06 {
    public static void main(String[] args) {
        // 目标：完成Map集合相关的案例：投票统计程序
        calc();
    }

    public static void calc() {
        List<String> locations = new ArrayList<>();
        String[] names = {"玉龙雪山", "长城", "少林寺", "丽江"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(names.length);
            locations.add(names[index]);
        }
        System.out.println(locations);

        // 2.统计每个景点被选择的次数
        // 最终统计的结果是一个键值对形式
        Map<String, Integer> map = new HashMap<>();

        // 3.遍历80个学生选择的景点，来统计选择的次数
        for (String location : locations) {
            //if (map.containsKey(location)){
            //    map.put(location,map.get(location)+1);
            //} else {
            //    map.put(location,1);
            //}
            map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }

        // 遍历map集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "==>" + map.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "==>" + value);
        }

        map.forEach((key, value) -> System.out.println(key + "==>" + value));

    }
}
