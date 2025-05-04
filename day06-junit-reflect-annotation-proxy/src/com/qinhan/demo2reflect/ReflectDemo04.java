package com.qinhan.demo2reflect;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        // 目标：搞清楚反射的应用：做框架的通用技术
        Dog dog = new Dog("小黑",3);
        SaveObjectFrameWork.saveObject(dog);

        // 创建学生对象
        Student stu = new Student("小明",18,"爱问问题");
        SaveObjectFrameWork.saveObject(stu);
        // 创建老师对象
        Teacher tea = new Teacher("小红",30,"爱讲故事",5000,"软件工程",'女',"123456789");
        SaveObjectFrameWork.saveObject(tea);
    }
}
