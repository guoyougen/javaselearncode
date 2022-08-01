package com.se.day14;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @projectname: learn
 * @packname: com.se.day5
 * @classname: RandomAccessFileDemo
 * @author: gyg
 * @date: 2022/7/27 下午 3:52
 * @version: 1.0
 * @description: TODO
 */

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        String path = "haha/test.txt";
        try (RandomAccessFile raf = new RandomAccessFile(path, "r")) {
            System.out.printf("字节数为%d\n",raf.length());
            int b =raf.read();
            System.out.printf("一次读了%c\n",(char)b);
            b =raf.read();
            System.out.printf("2次读了%c\n",(char)b);
            System.out.printf("现在位置%d\n",raf.getFilePointer());
            for (int i=0;i<3;i++){
                b=raf.read();
                System.out.printf("第%d次读到%c 位置%d\n",i+3,(char)b,raf.getFilePointer());
            }
            raf.seek(raf.getFilePointer()-2);
            System.out.printf("回拨两次\n");
            while ((b=raf.read())!=-1){

                System.out.printf("读到%c 位置%d\n",(char)b,raf.getFilePointer());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
writeDemo();
    }
    public static void writeDemo(){
        String path="haha/blank_file.dat";
        try(RandomAccessFile raf=new RandomAccessFile(path,"rw")){
            raf.write(65);
            raf.write(66);
            raf.seek(200*1024*1024);
            raf.write(89);
            raf.write(90);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

