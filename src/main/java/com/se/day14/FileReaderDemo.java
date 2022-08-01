package com.se.day14;

import java.io.*;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: FileReaderDemo
 * @author: gyg
 * @date: 2022/7/27 下午 8:23
 * @version: 1.0
 * @description: TODO
 */

public class FileReaderDemo {
    public static void main(String[] args) {
        String path="haha/poem.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(path));
        PrintWriter pw=new PrintWriter(new FileWriter("haha/poem_copy.txt"),true)){
            /*int c=-1;
            while ((c=br.read())!=-1){
                System.out.printf("%c",c);
                slowly(1000);
            }*/
            String line=null;
            while ((line=br.readLine())!=null){
                if(line!=null||line.trim().length()>0)
                pw.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void slowly(long millis){
        long now=System.currentTimeMillis();
        while ((true)){
            if((System.currentTimeMillis()-now)>=millis)
                break;
        }
    }
}
