package com.se.day3;

import java.util.Scanner;

public class sushu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数判断其是否为素数");
        int shu = scan.nextInt();
        while(shu<1){
            System.out.println("错误 整数小于1 素数需要大于等于1 请重新输入");
            shu = scan.nextInt();
        }
        boolean flag = true;
        for (int i = 2; i<=Math.sqrt(shu);i++) {
            if(shu%i==0)
                flag=false;
        }
        if(flag)
            System.out.println(shu+"是素数");
        else
            System.out.println(shu+"不是素数");
        scan.close();
    }

}
