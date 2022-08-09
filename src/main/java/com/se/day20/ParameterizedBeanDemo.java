package com.se.day20;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @projectname: javalearncode
 * @packname: com.se.day20
 * @classname: ParameterizedBeanDemo
 * @author: gyg
 * @date: 2022/8/6 下午 3:36
 * @version: 1.0
 * @description:
 */

public class ParameterizedBeanDemo {

    public static void main(String[] args){
      Class<?> c=ParameterizeBean.class;
      Field[] fields=c.getDeclaredFields();
      for (Field f : fields) {
          f.setAccessible(true);
          Type type=f.getGenericType();
          System.out.println(type);
          if(type instanceof ParameterizedType){
              ParameterizedType pt=(ParameterizedType)type;
              Type t=pt.getRawType();
              Type[] tarr=pt.getActualTypeArguments();
              System.out.printf("%s ",t.getTypeName());
              for (Type lt:tarr){
                  System.out.printf("%s ",lt.getTypeName());
              }
              System.out.println();
          }
      }
    }
}
