package com.se.day3;

import java.util.Scanner;

public class jiechen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数计算其阶乘");
        int shu = scan.nextInt();
        while(shu<1){
            System.out.println("错误 整数小于1 计算阶乘需要大于等于1 请重新输入");
            shu = scan.nextInt();
        }
        double jiechen =1;
        for (int i=2;i<=shu;i++){
            jiechen *= i;
        }
        System.out.println(shu+"的阶乘是"+jiechen);
        scan.close();
    }
}
