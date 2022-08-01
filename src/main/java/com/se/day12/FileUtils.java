package com.se.day12;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @projectname: learn
 * @packname: com.se.day12
 * @classname: FileUtils
 * @author: gyg
 * @date: 2022/7/24 下午 9:53
 * @version: 1.0
 * @description: TODO
 */


public class FileUtils {
    private static int countFileAll=0;//个数
    private static int countFileAllSuffix=0;//suffix文件个数
    private static long countFilesSize=0;//大小
    private static long countFilesSizeSuffix=0;//suffix文件大小
    //方法一：
    public int countFile(String path){
        //TODO 用来统计指定目录下的文件数量，不含文件夹的数量。
        File dirFile = new File(path);
        if(!dirFile.exists()){
            System.out.println(path+"不存在");
            return -1;
        }
        if(!dirFile.isDirectory()){
            System.out.println(path+"不是目录");
            return -1;
        }
        FilenameFilter fnf =  (dir, name) -> {
            File temp=new File(dir,name);
            return true;
        };
        countFile(dirFile,fnf);
        return countFileAll;
    }
    public void countFile(File dirFile,FilenameFilter fnf){
        System.out.printf("当前目录是 %s \n",dirFile.getAbsolutePath());
        File[] files = dirFile.listFiles(fnf);
        for (File f:files){
            if (f.isDirectory()){
                countFile(f,fnf);
            }
            else {
                System.out.printf("当前文件是 %20s  目前共有%2d 个文件\n",f.getName(),++countFileAll);
            }
        }
    }
    //方法二：
    public int countFile(String path, String suffix){
        //TODO 重载一个方法，用来统计指定扩展名的文件数量，比如：.java文件的数量
        File dirFile = new File(path);
        if(!dirFile.exists()){
            System.out.println(path+"不存在");
            return -1;
        }
        if(!dirFile.isDirectory()){
            System.out.println(path+"不是目录");
            return -1;
        }
        FilenameFilter fnf =  (dir, name) -> {
            File temp=new File(dir,name);
            if(temp.isDirectory()){
                return true;
            }
            if(temp.getName().endsWith(suffix)){
                return true;
            }
            return false;
        };
        countFile(dirFile,fnf,suffix);
        return countFileAllSuffix;
    }
    public void countFile(File dirFile,FilenameFilter fnf,String suffix){
        System.out.printf("当前目录是 %s \n",dirFile.getAbsolutePath());
        File[] files =dirFile.listFiles(fnf);
        for(File f:files){
            if(f.isDirectory()){
                countFile(f,fnf,suffix);
            }
            else {
                System.out.printf("当前%s文件是 %20s  目前共有%2d 个%s文件\n",suffix,f.getName(),++countFileAllSuffix,suffix);
            }
        }
    }
    //方法三
    public long duSize(String path) {
        //TODO 用来统计指定文件夹下面的所有文件的大小之和。单个文件的大小，可以通过 file.length() 方法来获取，单位是 kb, 如果小于1kb的，则以 b 为单位来显示。
        File dirFile = new File(path);
        if(!dirFile.exists()){
            System.out.println(path+"不存在");
            return -1;
        }
        if(!dirFile.isDirectory()){
            System.out.println(path+"不是目录");
            return -1;
        }
        FilenameFilter fnf =  (dir, name) -> {
            File temp=new File(dir,name);
            return true;
        };
        duSize(dirFile,fnf);
        return countFilesSize;
    }
    public void duSize(File dirFile,FilenameFilter fnf){
        System.out.printf("当前目录是 %s \n",dirFile.getAbsolutePath());
        File[] files = dirFile.listFiles(fnf);
        for (File f:files){
            if(f.isDirectory()){
                duSize(f,fnf);
            }
            else {
                countFilesSize+=f.length();
                System.out.printf("当前文件是 %20s ,大小是 %10dB,当前所有文件大小之和为 %15dB\n",f.getName(),f.length(),countFilesSize);
            }
        }
    }
    //方法四
    public long duSize(String path, String suffix) {
        //TODO  同样，再重载一个方法，用来统计指定文件夹下面某类扩展名文件的大小，比如 d:\temp 目录下所有.java文件的大小，单位是 kb, 如果小于1kb的，则以 b 为单位来显示。
        File dirFile = new File(path);
        if(!dirFile.exists()){
            System.out.println(path+"不存在");
            return -1;
        }
        if(!dirFile.isDirectory()){
            System.out.println(path+"不是目录");
            return -1;
        }
        FilenameFilter fnf =  (dir, name) -> {
            File temp=new File(dir,name);
            if(temp.isDirectory()){
                return true;
            }
            if(temp.getName().endsWith(suffix)){
                return true;
            }
            return false;
        };
        duSize(dirFile,fnf,suffix);
        return countFilesSizeSuffix;

    }
    public void duSize(File dirFile,FilenameFilter fnf,String suffix){
        System.out.printf("当前目录是 %s \n",dirFile.getAbsolutePath());
        File[] files = dirFile.listFiles(fnf);
        for (File f:files){
            if(f.isDirectory()){
                duSize(f,fnf,suffix);
            }
            else {
                countFilesSizeSuffix+=f.length();
                System.out.printf("当前%s文件是 %20s ,大小是 %10dB,当前所有%s文件大小之和为 %15dB\n",suffix,f.getName(),f.length(),suffix,countFilesSizeSuffix);
            }
        }
    }
}
