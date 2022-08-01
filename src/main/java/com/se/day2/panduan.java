package com.se.day2;

import java.util.Scanner;

public class panduan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int inoutIndex = scan.nextInt();
        boolean a = inoutIndex%2==0 ? true:false;
        System.out.println(inoutIndex+"是偶数吗？ "+a);
    }
}
