package com.se.day5;


import java.util.Calendar;
import java.util.Scanner;

public class diydate {
    public static void main(String[] args) {
        System.out.println("输入指定年月日 打印出月历图");
        System.out.println("输入年");
        Scanner scan =new Scanner(System.in);
        int year=scan.nextInt();
        System.out.println("输入月");
        int month=scan.nextInt();
        while(month<1||month>12){
            System.out.println("月份不合法 请重新输入");
            month=scan.nextInt();
        }
        System.out.println("输入日");
        int day=scan.nextInt();
        diydate a = new diydate();
        while(day<1||day>a.daymaster(year,month)){
            System.out.println("日期错误 请重新输入");
            day=scan.nextInt();
        }
        a.calendarprintln(year,month,day);
        scan.close();
    }
    public boolean isLeapYear(int year){
        if((year%400==0)||(year%4==0&&year%100!=0))
            return true;
        else return false;
    }
    public int daymaster(int year,int month){
        if (month==2){
            if (this.isLeapYear(year))
                return 29;
            else
                return 28;
        }
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            return 31;
        else
            return 30;
    }
    public void calendarprintln(int year,int month,int day){
        Calendar now = Calendar.getInstance();
        int dayofmonth=1;
        now.set(year,month-1,dayofmonth);
        int week = now.get(Calendar.DAY_OF_WEEK);
        System.out.printf("%5d年 %2d月\n==================\n",year,month);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun ");
        int daynum=this.daymaster(year,month);
        if (week==1)
            System.out.printf("%24s",' ');
        int k=week-2;
        for (int i=0;i<k;i++){
            System.out.print("    ");
        }
        for (int i=0;i<daynum;i++){
            if(i==day-1)
                System.out.print("*");
            System.out.printf("%-4d",i+1);
            if(week==7)
                week=0;
            if(week==1)
                System.out.println();
            week++;
        }
    }
}
