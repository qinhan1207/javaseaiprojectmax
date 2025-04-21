package com.qinhan.demo3stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo04 {
    public static void main(String[] args) {
        // 目标：掌握Stream流的统计，收集操作（终结方法）
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张无忌", 18, 9999.9));
        teachers.add(new Teacher("赵敏", 20, 8888.8));
        teachers.add(new Teacher("周芷若", 19, 7777.7));
        teachers.add(new Teacher("张三丰", 60, 6666.6));
        teachers.add(new Teacher("白眉鹰王", 66, 9999.9));
        teachers.add(new Teacher("成昆", 42, 48000));

        teachers.stream().filter(teacher -> teacher.getSalary()>8000).forEach(System.out::println);
        System.out.println("-------------------------------------");
        long count = teachers.stream().filter(t -> t.getSalary() > 8000).count();
        System.out.println(count);
        System.out.println("-------------------------------------");

        Optional<Teacher> max = teachers.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        Teacher maxTeacher = max.get();
        System.out.println(maxTeacher);
        System.out.println("-------------------------------------");

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张三丰");

        // 流只能收集一次

        // 收集到集合或数组中
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        // 收集到list集合
        List<String> list1 = s1.collect(Collectors.toList());
        System.out.println(list1);

        //Set<String> set = new HashSet<>();
        //set.addAll(list1);
        //System.out.println(set);

        // 收集到set集合
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> set = s2.collect(Collectors.toSet());
        System.out.println(set);

        // 收集到数组
        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        Object[] array = s3.toArray();
        System.out.println("数组"+Arrays.toString(array));

        // 收集到map集合
        System.out.println("-----------收集到map集合--------------");
        // 收集到map集合，键是老师名称，值是老师薪水
        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);

    }
}
