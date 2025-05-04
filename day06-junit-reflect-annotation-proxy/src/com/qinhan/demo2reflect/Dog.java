package com.qinhan.demo2reflect;

public class Dog {
    private String name;
    private int age;
    private String hobby;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Dog(String name, int age) {
        System.out.println("两个参数的构造器执行了");
        this.name = name;
        this.age = age;
    }

    private Dog(){
        System.out.println("无参构造器执行了");
    }

    private Dog(String name) {
        System.out.println("一个参数的构造器执行了");
        this.name = name;
    }

    private void eat(){
        System.out.println("狗吃骨头");
    }

    public String eat(String name){
        System.out.println("狗吃"+name+"嘿嘿嘿");
        return "狗说：谢谢！";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
