package com.qinhan.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraverseDemo05 {
    public static void main(String[] args) {
        // 掌握Map集合的遍历方式二：lambda
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥",20);
        map.put("嫦娥",28);
        map.put("女儿国王",31);
        map.put("铁扇公主",48);
        map.put("紫霞",31);
        System.out.println(map);

        //map.forEach(new BiConsumer<String, Integer>() {
        //    @Override
        //    public void accept(String string, Integer integer) {
        //        System.out.println(string+"===>"+integer);
        //    }
        //});

        map.forEach((key,value)-> System.out.println(key+"==>"+value));
    }
}
