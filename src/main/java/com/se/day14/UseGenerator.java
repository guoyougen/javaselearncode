package com.se.day14;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: UseGenerator
 * @author: gyg
 * @date: 2022/7/27 下午 1:44
 * @version: 1.0
 * @description: TODO
 */

public class UseGenerator {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            long id=IDGenerator.getID();
            System.out.println(id);
        }
    }
}
