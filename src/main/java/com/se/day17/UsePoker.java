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
        game.shuffle(game.newPoker());
        game.play(Poker.getCARDS(),3,18);
    }
}
