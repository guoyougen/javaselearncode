package com.se.day9;

import java.util.Date;

/**
 * @projectname: learn
 * @packname: com.se.day9
 * @classname: Ordertest
 * @author: gyg
 * @date: 2022/7/19 上午 10:33
 * @version: 1.0
 * @description: TODO
 */

public class Ordertest {
    public static void main(String[] args) {
        Customer c = new Customer("郭有根","13390634753",99);
        System.out.println(c.toString());
        Date orderdate =new Date();
        Date shipmentdate=new Date(1000000000);
        Order o = new Order(2000,orderdate,shipmentdate,true,c);
        System.out.println(o.toString());

        for(int i=0;i<1020;i++){
            System.out.println(OrderNoGenerator.generateNo());
        }
    }
}
