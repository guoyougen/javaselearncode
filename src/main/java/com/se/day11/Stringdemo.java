package com.se.day11;

import java.util.Scanner;

/**
 * @projectname: learn
 * @packname: com.se.day11
 * @classname: Stringdemo
 * @author: gyg
 * @date: 2022/7/21 上午 11:13
 * @version: 1.0
 * @description: TODO
 */

public class Stringdemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("shuru");
        String line=scan.nextLine();
        System.out.printf("%s  的 长度是 %d \n",line, line.length());
        for (int i=0;i<line.length();i++){
            System.out.printf("%c  码值 %d \n",line.charAt(i),line.codePointAt(i));
        }
        scan.close();

    }
}
