package com.se.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: ReaderDemo
 * @author: gyg
 * @date: 2022/7/27 下午 5:24
 * @version: 1.0
 * @description: TODO
 */

public class ReaderDemo {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            String line=null;
            while (true) {
                System.out.printf("shuru");
                line=br.readLine();
                if(line.equalsIgnoreCase("exit")){
                    System.out.println("jieshu");
                    break;
                }
                System.out.println(line);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
