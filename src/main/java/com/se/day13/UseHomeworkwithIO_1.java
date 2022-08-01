package com.se.day13;

/**
 * @projectname: learn
 * @packname: com.se.day13
 * @classname: UseHomeworkwithIO_1
 * @author: gyg
 * @date: 2022/7/25 下午 4:30
 * @version: 1.0
 * @description: TODO
 */

public class UseHomeworkwithIO_1 {
    public static void main(String[] args) {
        HomeworkwithIO_1 h = new HomeworkwithIO_1();
        if(h.copy("F:\\test\\zuoye\\郭有根-第十二章作业.md","F:\\test\\zuoye")){
            System.out.println("复制文件成功");
        }
        if(h.copyDir("F:\\test","F:\\test3")){
            System.out.println("复制目录成功");
        }
    }
}
