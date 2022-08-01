package com.se.day4;

import java.util.Scanner;

public class fb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入菲波娜齐数列的长度");
        int len=scan.nextInt();
        while(len<1){
            System.out.println("长度需大于0 重新输入");
            len = scan.nextInt();
        }
        int [] fb = new int[len];
        if(len==1){
            fb[0]=1;
            System.out.println("长度为"+len+"的菲波娜齐数列为 "+fb[0]);
        } else if (len==2) {
            fb[0]=fb[1]=1;
            System.out.println("长度为"+len+"的菲波娜齐数列为 "+fb[0]+", "+fb[1]);
        } else {
            fb[0]=fb[1]=1;
            for (int i=2;i<len;i++){
                fb[i]=fb[i-1]+fb[i-2];
            }
            System.out.print("长度为"+len+"的菲波娜齐数列为 "+fb[0]+", "+fb[1]);
            for (int i =2;i<len;i++){
                System.out.print(", "+fb[i]);
            }
        }
        scan.close();
    }
}
