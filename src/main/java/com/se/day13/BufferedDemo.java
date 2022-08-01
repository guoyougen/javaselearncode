package com.se.day13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @projectname: learn
 * @packname: com.se.day13
 * @classname: BufferedDemo
 * @author: gyg
 * @date: 2022/7/25 下午 2:36
 * @version: 1.0
 * @description: TODO
 */

public class BufferedDemo {
    public static void main(String[] args) {
        String path="src/com/se/day13/sma.md";
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(path),16)){
        byte[] buf=new byte[8];
        int len = -1;
        if(bis.markSupported()){
            System.out.println("dfg");
            bis.mark(4);
        }
        while ((len=bis.read(buf))!=-1){
            System.out.printf("");
        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
