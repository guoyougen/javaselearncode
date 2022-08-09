package com.se.day20;

import com.se.day9.Order;

import java.lang.reflect.TypeVariable;
import java.util.Map;

/**
 * @projectname: javalearncode
 * @packname: com.se.day20
 * @classname: TypeVariableDemo
 * @author: gyg
 * @date: 2022/8/6 下午 2:56
 * @version: 1.0
 * @description:
 */

public class TypeVariableDemo {

    public static void main(String[] args){
      //
        Class<?> mapClass = Order.class;
        TypeVariable<?>[] tvs=mapClass.getTypeParameters();
        if(tvs.length>0){
            System.out.println("fanxing");

        }
        else{
            System.out.println("bushi");
        }
    }
}
