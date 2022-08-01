package com.se.day3;
import java.lang.Math;
public class shuixianhua {
    public static void main(String[] args) {
        int sum=0;
        int bs=0;
        int ss=0;
        int ts=0;
        int count=100;
        for (int b=1;b<=9;b++){
            bs=(int)Math.pow(b,3);
            for (int s=0;s<=9;s++){
                ss=(int)Math.pow(s,3);
                ts=bs+ss;
                for(int g=0;g<=9;g++){
                    sum=ts+(int)Math.pow(g,3);
                    if(sum==count++){
                        System.out.print(count-1+", ");
                    }
                }
            }
        }
        System.out.println("是水仙花数");
    }
}
