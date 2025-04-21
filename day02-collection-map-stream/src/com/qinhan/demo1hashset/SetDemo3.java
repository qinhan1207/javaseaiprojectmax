package com.qinhan.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        // 目标：TreeSet集合对于自定义对象的排序
        Set<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //return o2.getAge()-o1.getAge(); // 年龄降序
                //return Double.compare(o1.getSalary(),o2.getSalary());   // 薪水升序
                return Double.compare(o2.getSalary(),o1.getSalary());   // 薪水降序

            }
        }); // 排序，无重复，无索引

        //Set<Teacher> teachers = new TreeSet<>((o1,o2)->Double.compare(o1.getSalary(),o2.getSalary()));

        teachers.add(new Teacher("张三", 30, 6232.4));
        teachers.add(new Teacher("李四", 28, 3999.5));
        teachers.add(new Teacher("王五", 35, 9999.9));
        teachers.add(new Teacher("赵六", 30, 8888.8));
        System.out.println(teachers);

        // 结论：TreeSet集合默认不能给自定义对象排序，因为不知道大小规则
        // 一定要能解决怎么办？
        // 1.对象类实现一个Comparable接口，重写compareTo方法，指定比较规则
        // 2.public TreeSet集合自带比较器Comparator对象，指定比较规则
    }
}
