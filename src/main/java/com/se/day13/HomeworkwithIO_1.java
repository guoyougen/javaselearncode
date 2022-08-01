package com.se.day13;

import java.io.*;

/**
 * @projectname: learn
 * @packname: com.se.day13
 * @classname: HomeworkwithIO_1
 * @author: gyg
 * @date: 2022/7/25 下午 3:45
 * @version: 1.0
 * @description: TODO
 */

public class HomeworkwithIO_1 {
    /*******
     * 方法一：文件COPY
     * @param src 表示源文件，不能是目录，如果判断是目录，则方法提示不支持。
     * @param dest 表示目标，可以是目录也可以是文件。
     */
    public  boolean copy(String src, String dest) {
        File srcFile=new File(src);
        if(!srcFile.exists()){
            System.out.printf("源文件[%s]不存在\n",src);
            return false;
        }
        if(srcFile.isDirectory()){
            System.out.printf("此方法不支持目录copy\n");
            return false;
        }
        File destFile=new File(dest);

        File target=null;//真正的文件

        if(destFile.isDirectory()){
            if(destFile.equals(srcFile.getParentFile())){
                StringBuilder s=new StringBuilder();
                s.append(srcFile.getName(), 0, srcFile.getName().lastIndexOf("."))
                        .append("_副本")
                        .append(srcFile.getName().substring(srcFile.getName().lastIndexOf(".")));
                target = new File(destFile,s.toString());
            }
            else {
                target = new File(destFile, srcFile.getName());
            }
        }
        else {
            target = new File(dest);
        }

        return copyWithIO(srcFile,target);
    }
    private  boolean copyWithIO(File srcFile,File target){
        try(  BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile.getAbsolutePath()));
              BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target.getAbsolutePath()))) {
            byte[] buf = new byte[1024];
            int len=-1;
            while ((len=bis.read(buf))!=-1){
                bos.write(buf,0,len);
            }
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }

    }

    /*****
     * 方法二： 文件夹COPY【可选】
     * @param srcDir 表示源目录，此参数必需是目录。
     * @param destDir 目标目录，此参数必需是目录。
     */
    public boolean copyDir(String srcDir, String destDir) {
        File srcDirFile=new File(srcDir);
        if(!srcDirFile.exists()){
            System.out.printf("源目录[%s]不存在\n",srcDirFile);
            return false;
        }
        if(srcDirFile.isFile()){
            System.out.printf("此方法不支持文件copy\n");
            return false;
        }
        File destDirFile=new File(destDir);

        if(destDirFile.isFile()){
            System.out.printf("此方法不支持目录copy到文件\n");
            return false;
        }

        boolean flag=false;
        StringBuilder builder=new StringBuilder();
        builder.append(srcDir)
                .append(File.separator);
        flag=destDir.startsWith(builder.toString());
        if(flag){
            System.out.println("错误：目标文件夹是源文件夹的子文件夹。无法复制 ， 有祖母悖论");
            return false;
        }
        if(!destDirFile.exists()){
            System.out.printf("目标目录[%s]不存在 创建目标目录\n",destDirFile);
            if(destDirFile.mkdirs())
                System.out.printf("目标目录[%s]创建成功\n",destDirFile);
        }

        File target=null;// 在目标目录下创建源目录  之后把源目录下的子文件夹和子文件复制过去
        FilenameFilter fnf =  (dir, name) -> {
            File temp=new File(dir,name);
            return true;
        };

        StringBuilder srcP=new StringBuilder();//判断目标目录是否为源目录的父目录
        srcP.append(srcDir, 0, srcDir.lastIndexOf("\\"));
        System.out.printf("%s   %s\n",srcP,destDir);
        if(srcP.toString().equals(destDir)){
            System.out.printf("创建的是源目录的副本文件夹\n");
            target=new File(destDir,srcDirFile.getName()+"_副本");
            target.mkdirs();
        }
        else {
            target=new File(destDir,srcDirFile.getName());
            if(!target.exists())
                target.mkdirs();
        }
        return copyDirWithIO(srcDirFile,target,fnf);
    }
    private boolean copyDirWithIO(File srcDirFile,File target,FilenameFilter fnf){
            File[] files=srcDirFile.listFiles(fnf);
            System.out.printf("当前目录是 %s \n",srcDirFile.getAbsolutePath());
            for (File f:files){
                if(f.isDirectory()){//如果是目录先创建目录 再递归调用
                    try {
                        File temp=new File(target.getCanonicalPath()+"\\"+f.getName());
                        if(!temp.exists())
                            temp.mkdirs();
                        copyDirWithIO(f,temp,fnf);
                    } catch (IOException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
                else {
                    try{
                        copy(f.getCanonicalPath(),target.getCanonicalPath());//调用copy方法
                    }catch (IOException e){
                        e.printStackTrace();
                        return false;
                    }
                }
            }
            return true;
    }
}
