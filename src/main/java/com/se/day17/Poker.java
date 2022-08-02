package com.se.day17;

import java.util.*;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: Poker
 * @author: gyg
 * @date: 2022/8/2 上午 2:17
 * @version: 1.0
 * @description:
 */

public class Poker {

    //属性
    private static final List<Card> CARDS=new ArrayList<Card>(54);

    private boolean hasKing;

//构造方法,请自行完成
    public Poker(){
        this.hasKing = false;
        newPoker();
    }
    public Poker(boolean hasKing){
        this.hasKing = hasKing;
        newPoker();
    }
//业务方法
    public List<Card> newPoker() {
        if(CARDS.size()!=0) {
            CARDS.clear();
        }
//TODO 请自行实现

        Suit[] suits= Suit.values();
        Rank[] ranks=Rank.values();
        for (Suit suit : suits) {
            for (Rank rank : ranks){
                CARDS.add(new Card(suit, rank));
            }
        }
        if(hasKing){
            CARDS.add(new JokerCard("大王"));
            CARDS.add(new JokerCard("小王"));
        }
        return CARDS;
    }

    public static List<Card> getCARDS() {
        return CARDS;
    }

    public void shuffle(List<Card> poker) {
        Collections.shuffle(CARDS);
    }
    public void play(List<Card> poker, int player, int cardsForEach) {
        if(poker==null) {
            return;
        }
        if(cardsForEach*player>poker.size()) {
            System.out.println("每位玩家获得太多 重输cardsForEach\n");
            return;
        }
        Card[][] playerCard = new Card[player][cardsForEach] ;
        Random rand = new Random();
        for (int i = 0; i<cardsForEach;i++){
            for (int j = 0; j<player;j++){
                int t=rand.nextInt(poker.size());
                playerCard[j][i]=poker.get(t);
                Iterator<Card> iterator=poker.iterator();
                while (iterator.hasNext()){
                    if(iterator.next().equals(poker.get(t))){
                        iterator.remove();
                        break;
                    }
                }
            }
        }

        System.out.printf("\n发牌结束\n");
        for(int i=0; i<player;i++){
            for (int j=0; j<cardsForEach;j++){
            System.out.printf("%3s ",playerCard[i][j].toString());
            }
            System.out.println();
        }

    }

    public void print() {
        System.out.printf("打印牌堆里的扑克牌\n");
        for(int i=0; i<CARDS.size(); i++){
            System.out.printf("%3s ",CARDS.get(i));
        }
        System.out.println();
    }
}
