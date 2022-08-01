package com.se.day12;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

/**
 * @projectname: learn
 * @packname: com.se.day12
 * @classname: FileDemo
 * @author: gyg
 * @date: 2022/7/23 下午 2:27
 * @version: 1.0
 * @description: TODO
 */

public class FileDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("shuru");
        String path =scan.nextLine();
        FileDemo fd = new FileDemo();
        fd.dir(path);
        scan.close();
    }
    public void dir(String path){
        File dirFile = new File(path);
        if(!dirFile.exists()){
            System.out.println("不存在");
            return;
        }
        if(dirFile.isFile()){
            Date date = new Date(dirFile.lastModified());
            long size=dirFile.getTotalSpace();
            String name=dirFile.getName();
            System.out.printf("%1$ty-%1$tM-%1$td %1$tH:%1$tm -> %2$s\n",date,name);
            return;
        }
        dir(dirFile);
    }
    private void dir(File dirFile){
        File[] files=dirFile.listFiles();
        for (File f : files) {
            Date date = new Date(f.lastModified());
            long size=f.getTotalSpace();
            String name=f.getName();
            System.out.printf("%1$ty-%1$tM-%1$td %1$tH:%1$tm -> %2$s\n",date,name);
        }
    }
}
