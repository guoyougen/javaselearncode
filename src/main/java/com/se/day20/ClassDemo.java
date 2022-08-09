package com.se.day20;

import com.se.day9.Order;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @projectname: javalearncode
 * @packname: com.se.day20
 * @classname: ClassDemo
 * @author: gyg
 * @date: 2022/8/6 下午 1:23
 * @version: 1.0
 * @description:
 */

public class ClassDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
      //
        Class<Order> ordClass=Order.class;
        System.out.printf("%s %s \n",ordClass.getSimpleName(),ordClass.getName());

       // Field[] ords=ordClass.getFields();
        Field[] ords=ordClass.getDeclaredFields();
        System.out.printf("%s类中有%s个属性\n",ordClass.getName(),ords.length);
        for (Field fields:ords){
            System.out.printf("%s  %s\n",fields.getName(), Modifier.toString(fields.getModifiers()));
            fields.setAccessible(true);
            if(Modifier.isStatic(fields.getModifiers())){
                fields.set(null,200);
            }
        }
        Field increase=ordClass.getDeclaredField("increase");
        increase.setAccessible(true);
        System.out.printf("%s \n",increase.get(null));

        Method[] methods=ordClass.getDeclaredMethods();
        for (Method m:methods){
            System.out.printf("%s %s\n",m.getName(),Modifier.toString(m.getModifiers()));
            Parameter[] params=m.getParameters();
            if(params.length>0){
                for (Parameter p:params)
                System.out.printf("%s  %s\n",p.getType(),p.getName());
            }
            else {
                System.out.println("null");
            }
        }

    }
}
