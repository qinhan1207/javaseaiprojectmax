package com.qinhan.demo3stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        // 目标：获取Stream流
        // 1.获取集合的Stream流：调用集合提供的.stream()方法
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        // 2.Map集合，怎么拿Stream流
        Map<String,Integer> map = new HashMap<>();
        // 获取键流
        Stream s2 = map.keySet().stream();
        // 获取值流
        Stream<Integer> s3 = map.values().stream();
        // 获取键值对流
        Stream<Map.Entry<String, Integer>> s4 = map.entrySet().stream();

        // 3.获取数组的流
        String[] names = {"赵敏","周芷若","小昭","张无忌","玄冥二老","殷素素"};
        Stream<String> s5 = Arrays.stream(names);

        Stream<String> s6 = Stream.of(names);

        Stream<String> s7 = Stream.of("赵敏","周芷若","小昭","张无忌","玄冥二老","殷素素");
    }
}
