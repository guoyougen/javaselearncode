package com.se.day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @projectname: learn
 * @packname: com.se.day13
 * @classname: SimpleStreamDemo
 * @author: gyg
 * @date: 2022/7/25 上午 11:13
 * @version: 1.0
 * @description: TODO
 */

public class SimpleStreamDemo {
    public static void main(String[] args) {
        String path="src/com/se/day13/sma.md";
        File pathFile=new File(path);
        if(!pathFile.exists()){
            System.out.println("不存在");
            return;
        }
        try(FileInputStream fis=new FileInputStream(pathFile)){
            System.out.printf("%d\n",fis.available());
            /*int b =-1;
            while ((b= fis.read())!=-1){
                System.out.println(b);
            }*/
            byte[] buf=new byte[5];
            int len=-1;
            while ((len= fis.read(buf))!=-1){
                System.out.printf("%d %s %s\n",len, Arrays.toString(buf),fis.available());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
