package com.qinhan.demo04test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Room {

    // 1.准备好54张牌，给房间使用：定义一个集合容器来装54张牌
    private List<Card> allCards = new ArrayList<>();

    // 2.初始化54张牌进去。
    {
        // 3.准备点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4.准备花色
        String[] colors = {"♥", "♠", "♣", "♦"};

        // 5.组合花色和点数成为排对象，加入到集合中去
        int num = 0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                // 6.将牌对象加入到集合中
                allCards.add(new Card(size, color,num));
            }
        }
        //allCards.add(new Card("","🃏"));
        //allCards.add(new Card("","👲"));
        Collections.addAll(allCards, new Card("", "🃏",++num), new Card("", "👲",++num));
        System.out.println("新牌是" + allCards);
    }

    public void start() {
        // 8.洗牌：随机打乱集合中的顺序
        Collections.shuffle(allCards);
        System.out.println("洗牌后" + allCards);

        // 9.发牌：定义三个玩家：令狐冲=【】，令狐白=【】，令狐紫=【】
        Map<String, List<Card>> players = new HashMap<>();

        List<Card> lhc = new ArrayList<>();
        players.put("令狐冲", lhc);

        List<Card> lhb = new ArrayList<>();
        players.put("令狐白", lhb);

        List<Card> lhz = new ArrayList<>();
        players.put("令狐紫", lhz);

        for (int i = 0; i < allCards.size() - 3; i++) {
            // 获取到当前遍历的牌
            Card card = allCards.get(i);
            // 判断当前这张牌发给谁
            if (i % 3 == 0) {
                lhc.add(card);
            } else if (i % 3 == 1) {
                lhb.add(card);
            } else {
                lhz.add(card);
            }
        }
        System.out.println("发牌后" + players);



        // 10.拿最后三张底牌
        List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("底牌"+lastCards);

        // 抢地主：把这个底牌集合直接给玩家
        lhc.addAll(lastCards);

        // 11. 对牌排序
        sortCards(lhc);
        sortCards(lhb);
        sortCards(lhz);


        // 12.看牌
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            String name = entry.getKey();
            List<Card> cards = entry.getValue();
            System.out.println(name + "的牌是：" + cards);
        }
    }


    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getNum()-o1.getNum();
            }
        });
    }
}
