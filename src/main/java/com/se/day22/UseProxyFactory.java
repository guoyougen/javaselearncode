package com.se.day22;

/**
 * @projectname: javalearncode
 * @packname: com.se.day22
 * @classname: Use
 * @author: gyg
 * @date: 2022/8/8 上午 5:08
 * @version: 1.0
 * @description:
 */

public class UseProxyFactory {
    public static void main(String[] args) {
        IA iaDemo = new IA_Imp_1();

        IA proxy = (IA)new CglibProxyFactory(iaDemo).getProxyInstance();

        proxy.ma();
    }
}
