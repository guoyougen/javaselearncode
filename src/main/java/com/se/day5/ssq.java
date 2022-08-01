package com.se.day5;


import java.util.Random;
import java.util.Scanner;

public class ssq {
    public static void main(String[] args) {
        System.out.println("生成几注双色球");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        ssq s = new ssq();
        System.out.println("红色                    蓝色");
        for (int i=0;i<n;i++){
            s.printSsq(s.generate());
        }
        scan.close();
    }
    public int [] generate(){
        Random r =new Random();
        int count=0;
        int [] red = new int[6];
        int blue=r.nextInt(16)+1;
        int temp;
        boolean flag=true;
        for (int i=0;i<6;i++){
            do {
                flag=true;
                temp = r.nextInt(33) + 1;
                for (int j = 0; j < count; j++) {
                    if (red[j] == temp) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    red[count++] = temp;
                    break;
                }
            }
            while(true);
        }
        int [] ssq= new int[7];
        System.arraycopy(red,0,ssq,0,6);
        ssq[6]=blue;
        return ssq;
    }
    public void printSsq(int a[]){
        for(int elements:a) {
            System.out.printf("%-4d",elements);
        }
        System.out.println();
    }
}
