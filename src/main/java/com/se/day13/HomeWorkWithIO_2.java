package com.se.day13;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
/**
 * @projectname: learn
 * @packname: com.se.day13
 * @classname: HomeWorkWithIO_2
 * @author: gyg
 * @date: 2022/7/26 上午 2:06
 * @version: 1.0
 * @description: TODO
 */

public class HomeWorkWithIO_2 {
    /*********
     * 把指定目录下的所有.jpg文件COPY同级目录中的cpimg目录中，如果在当前目录下没有cpimg目录，则创建它。
     * @param srcDir 指定的目录。
     */
    public boolean copyJpg(String srcDir) {
        File srcDirFile = new File(srcDir);
        if(!srcDirFile.exists()){
            System.out.printf("源文件[%s]不存在\n",srcDirFile);
            return false;
        }
        if(srcDirFile.isFile()){
            System.out.printf("此方法不支持文件\n");
            return false;
        }
        try {
            File cpimgFile=new File(srcDirFile.getCanonicalPath()+"\\cpimg");
            if(!cpimgFile.exists()){
                System.out.printf("创建好 cpimg文件夹\n");
                cpimgFile.mkdirs();
            }
            System.out.printf("找到cpimg文件夹\n");
            FilenameFilter fnf =  (dir, name) -> {
                File temp=new File(dir,name);
                if(temp.isDirectory()&&!temp.getName().equals("cpimg"))
                    return true;
                else if(temp.getName().endsWith(".jpg"))
                    return true;
                else return false;
            };
            return copyJpg(srcDirFile,cpimgFile,fnf);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean copyJpg(File srcDirFile,File cpimgFile,FilenameFilter fnf){
        File[] files=srcDirFile.listFiles(fnf);
        for(File f:files){
            if(f.isDirectory()){
                    copyJpg(f,cpimgFile,fnf);
            }
            else {
                if(judgeJpgExists(f,cpimgFile)){
                    System.out.printf("发现重复照片%s 不复制\n",f.getName());
                }
                else {
                    try {
                        HomeworkwithIO_1 h =new HomeworkwithIO_1();
                        if(!h.copy(f.getCanonicalPath(),cpimgFile.getCanonicalPath())){
                            System.out.printf("复制失败\n");
                            return false;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean judgeJpgExists (File srcFile,File target){
        File[] files=target.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                if(judgeJpgExists(srcFile,f)){
                    return true;
                }
            }
            else {
                if(f.getName().equals(srcFile.getName())){
                    return true;
                }
            }
        }
        return false;
    }
}
