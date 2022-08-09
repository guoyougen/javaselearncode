package com.se.day20;

import com.se.day9.Order;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @projectname: javalearncode
 * @packname: com.se.day20
 * @classname: MethodInvokeDemo
 * @author: gyg
 * @date: 2022/8/6 下午 2:00
 * @version: 1.0
 * @description:
 */

public class MethodInvokeDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
      //
        Order o1 = new Order();
        o1.setId(1001001);
        System.out.println(o1.getId());

        Class<Order> ordClass =Order.class;
        Constructor<Order> defaultConstructor = ordClass.getDeclaredConstructor();
        Order o2=defaultConstructor.newInstance();
        Method setMethod = ordClass.getDeclaredMethod("setId", long.class);
        setMethod.invoke(o2,2002222);
        System.out.println(o2.getId());
    }
}
