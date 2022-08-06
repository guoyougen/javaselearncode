package com.se.day20;

/**
 * @projectname: javalearncode
 * @packname: com.se.day20
 * @classname: ClassLoder
 * @author: gyg
 * @date: 2022/8/6 上午 2:20
 * @version: 1.0
 * @description:
 */

public class ClassLoder {

    public static void main(String[] args){
      //
        ClassLoader cl=ClassLoader.getSystemClassLoader();
        System.out.println(cl);

        System.out.println(cl.getParent());
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("sun.boot.class.path"));
    }
}
