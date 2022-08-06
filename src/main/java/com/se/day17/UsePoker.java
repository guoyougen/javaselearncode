package com.se.day17;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: UsePoker
 * @author: gyg
 * @date: 2022/8/2 上午 3:08
 * @version: 1.0
 * @description:
 */

public class UsePoker {
    public static void main(String[] args){
      //
        Poker game= new Poker(true);
        game.print();
        game.shuffle(game.getCurrentCards());
        System.out.println("洗牌结束");
        game.print();
        game.play(game.getCurrentCards(),3,18);
    }
}
