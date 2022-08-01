package com.se.day5;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入开始值和终止值 打印出其中的素数");
        System.out.println("输入一个整数 确定start值");
        int start = scan.nextInt();
        System.out.println("输入一个整数 确定end值");
        int end = scan.nextInt();
        prime a = new prime();
        a.printPrime(start,end);
        scan.close();
    }

    public boolean isPrime(int num){
        while(num<1){
            System.out.println("错误 整数小于1 素数需要大于等于1 请重新输入");
            return false;
        }
        boolean flag = true;
        for (int i = 2; i<=Math.sqrt(num);i++) {
            if(num%i==0)
                flag=false;
        }
        if(flag)
            return true;
        else
            return false;
    }
    public void printPrime(int start,int end) {
        System.out.printf("%d和%d之间的素数有 \n", start, end);
        int count = 0;
        while (start <= end) {
            if (this.isPrime(start++)) {
                System.out.printf("%-5d, ",start-1);
                count++;
            }
            if (count == 10) {
                count=0;
                System.out.println();
            }

        }
    }
}
