package com.se.day4;


import java.util.Scanner;

public class sanjiao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入高度");
        int height = scan.nextInt();
        while(height<1){
            System.out.println("错误 高度需要大于等于1 重新输入");
            height=scan.nextInt();
        }
        System.out.println("实心三角");
        for (int i=0;i<height;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("空心三角");
        System.out.println("*");
        for (int i=1;i<height-1;i++){
            System.out.print("*");
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        if(height>1)
            for (int i=0;i<height;i++)
                System.out.print("*");
            System.out.println();
        scan.close();
    }

}
