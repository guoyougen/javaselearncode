package com.se.day18;

import java.util.Arrays;

/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: SimpleStreamDemo
 * @author: gyg
 * @date: 2022/8/4 上午 11:20
 * @version: 1.0
 * @description:
 */

public class SimpleStreamDemo {
    public static void main(String[] args){
      //
        Integer[] intArr = {90,-1,18,-5,-13,-9,118,45,23,45,-17};
        int count=0;
        long size=Arrays.stream(intArr).filter((element) -> element>0).count();
        System.out.println(size);
    }
}

