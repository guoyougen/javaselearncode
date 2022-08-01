package com.se.day17;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: GenericMethodDemo
 * @author: gyg
 * @date: 2022/8/1 下午 3:38
 * @version: 1.0
 * @description:
 */

public class GenericMethodDemo {
    public static void main(String[] args){
      //

    }
    public static <T extends Comparable<? super T>> int compare(T a, T b) {
        return a.compareTo(b);
    }
}
