package com.se.day4;

import java.util.Scanner;

public class wanmei {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数，求出范围内的完美数");
        int count=scan.nextInt();
        while(count<2){
            System.out.println("错误 整数小于2 完美数最起码大于2 请重新输入");
            count = scan.nextInt();
        }
        int [] a=new int[55];
        int sum=0;
        int num=0;
        for (int i =2;i<=count;i++){
            sum=0;
            for (int j =1;j<i;j++){
                if(i%j==0)
                    sum+=j;
            }
            if(sum==i)
                a[num++]=i;
        }
        System.out.print(count+"范围内和完全数是 " );
        for (int i=0;i<num;i++){
            System.out.print(a[i]+",");
        }
        scan.close();
    }
}
