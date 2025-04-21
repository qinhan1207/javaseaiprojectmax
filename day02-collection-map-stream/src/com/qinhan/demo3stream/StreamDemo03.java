package com.qinhan.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        // 目标：掌握Stream提供的常用的中间方法，对流上的数据进行处理（返回新流：支持链式编程）
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");

        // 1.过滤方法
        list.stream().filter(name->name.startsWith("张")&&name.length()==3).forEach(System.out::println);

        // 2.排序方法
        List<Double> scores = new ArrayList<>();
        scores.add(99.6);
        scores.add(100.0);
        scores.add(100.0);
        scores.add(99.9);
        scores.add(99.7);
        scores.add(99.8);
        scores.stream().sorted().forEach(System.out::println); // 默认升序

        System.out.println("====降序排序====");
        scores.stream().sorted(((o1, o2) -> Double.compare(o2,o1))).forEach(System.out::println); // 降序
        System.out.println("只要前两名");
        scores.stream().sorted(((o1, o2) -> Double.compare(o2,o1))).limit(2).forEach(System.out::println); // 只要前两名
        System.out.println("跳过前两名");
        scores.stream().sorted(((o1, o2) -> Double.compare(o2,o1))).skip(2).forEach(System.out::println); // 跳过前两名
        System.out.println("去重");
        // 如果希望自定义对象可以去重，需要重写对象hashCode和equals方法
        scores.stream().distinct().sorted(((o1, o2) -> Double.compare(o2,o1))).forEach(System.out::println); // 跳过前两名

        // 映射方法/加工方法：把流上原来的数据拿出来变成新数据又放到流上去
        scores.stream().map(s->"加10分后："+(s+10)).forEach(System.out::println);

        // 合并流
        Stream<String> s1 = Stream.of("赵敏","周芷若","小昭","张无忌","玄冥二老","殷素素");
        Stream<Integer> s2 = Stream.of(11,22,33,44);

        Stream<Object> s3 = Stream.concat(s1, s2);
        System.out.println(s3.count());


    }
}
