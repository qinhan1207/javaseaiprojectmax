package com.qinhan.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) {
        // 目标：完成多线程的综合小案例
        // 红包雨游戏，某企业有100名员工，员工的工号依次是1,2,3,4...100
        // 现在公司举办了年会活动，活动中有一个红包雨环节，要求共计发出200个红包，其中小红包在[1-30]元之间
        // 总比为80%，大红包为[31-100]元，总比为20%
        // 分析：100个员工实际上就是100个进程，来竞争200个红包。
        List<Integer> redPacket = getRedPacket();
        // 2.定义线程类，创建100个线程，竞争同一个集合
        for (int i = 1; i <= 100; i++) {
            new PeopleGetThread(redPacket,"人"+i).start();
        }
    }

    // 1.准备200个随机金额的红包。放到list集合中去返回
    public static List<Integer> getRedPacket(){
        //其中小红包在[1-30]元之间,占比为80%，大红包为[31-100]元，总比为20%
        Random r = new Random();
        List<Integer> redPacket = new ArrayList<>();
        for (int i = 1; i <= 160; i++) {
            redPacket.add(r.nextInt(30)+1);
        }
        for (int i = 1; i <= 40; i++) {
            redPacket.add(r.nextInt(70)+31);
        }
        return redPacket;
    }
}
