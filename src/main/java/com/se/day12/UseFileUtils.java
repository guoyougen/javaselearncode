package com.se.day12;

/**
 * @projectname: learn
 * @packname: com.se.day12
 * @classname: UseFileUtils
 * @author: gyg
 * @date: 2022/7/25 上午 12:41
 * @version: 1.0
 * @description: TODO
 */

public class UseFileUtils {
    public static void main(String[] args) {
        FileUtils f = new FileUtils();
        String path="F:\\data\\javaLearn\\test";
        String suffix=".java";
        System.out.printf("当前目录是%s ,共有%d个文件\n\n",path,f.countFile(path));
        System.out.printf("当前目录是%s ,共有%d个%s文件\n\n",path,f.countFile(path,suffix),suffix);
        long size=f.duSize(path);
        if(size>=1024)
            System.out.printf("当前目录是%s, 所有文件大小为%d KB\n\n",path,size/1024);
        else
            System.out.printf("当前目录是%s, 所有文件大小为%d B\n\n",path,size);
        size=f.duSize(path,suffix);
        if(size>=1024)
            System.out.printf("当前目录是%s, 所有%s文件大小为%d KB\n",path,suffix,size/1024);
        else
            System.out.printf("当前目录是%s, 所有%s文件大小为%d B\n",path,suffix,size);
    }
}
