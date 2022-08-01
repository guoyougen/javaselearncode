package com.se.day6;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        GuessNumber g = new GuessNumber();
        Scanner scan = new Scanner(System.in);
        int num;
        do{
            System.out.printf("输入一个[%d,%d]的整数进行猜测\n",g.getGuessLow(),g.getGuessHigh());
            num= scan.nextInt();
        }while (!g.guess(num));
        System.out.println("一共猜测"+g.getCount()+"次");
        scan.close();
    }
}
