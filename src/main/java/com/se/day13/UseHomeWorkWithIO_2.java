package com.se.day13;

/**
 * @projectname: learn
 * @packname: com.se.day13
 * @classname: UseHomeWorkWithIO_2
 * @author: gyg
 * @date: 2022/7/26 上午 9:23
 * @version: 1.0
 * @description: TODO
 */

public class UseHomeWorkWithIO_2 {
    public static void main(String[] args) {
        HomeWorkWithIO_2 h =new HomeWorkWithIO_2();
        if(h.copyJpg("F:\\test2")){
            System.out.println("复制jpg成功");
        }
    }
}
