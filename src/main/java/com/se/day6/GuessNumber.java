package com.se.day6;

import java.util.Random;

public class GuessNumber {
    private int trueint;
    private int guessLow;
    private int guessHigh;
    private int count;
    public GuessNumber(){
        Random r=new Random();
        trueint=r.nextInt(100)+1;
        guessLow=1;
        guessHigh=100;
        count=0;
    }

    public boolean guess(int g){
        count++;
        if(g==trueint){
            System.out.println("猜对了 随机数是"+trueint+" 共猜测 "+count+"次");
            return true;
        }
        else if(g>trueint){
            System.out.println("猜大了 已猜测"+count+"次");
            guessHigh=g-1;
            return false;
        }
        else {
            System.out.println("猜小了 已猜测"+count+"次");
            guessLow=g+1;
            return false;
        }

    }
    public int getGuessLow(){
        return guessLow;
    }
    public int getGuessHigh(){
        return guessHigh;
    }
    public int getCount(){
        return count;
    }

}
