package com.se.day15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @projectname: learn
 * @packname: com.se.day15
 * @classname: LinkedListDemo
 * @author: gyg
 * @date: 2022/7/28 上午 11:47
 * @version: 1.0
 * @description: TODO
 */

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> integerList=new LinkedList<>();
        integerList.add(10);
        integerList.add(30);
        integerList.add(99);
        integerList.add(10);
        integerList.add(88);
        integerList.add(1098);
        integerList.add(107);
        integerList.add(150);
        for (Integer i:integerList){
            System.out.printf("%d ",i);
        }
        Iterator<Integer> iter=integerList.iterator();
        while (iter.hasNext()){
            System.out.printf("\n%d ",iter.next());
        }
        integerList.add(2,888);
        Integer[] intArr=new Integer[integerList.size()];
        integerList.toArray(intArr);
        for(Integer element:intArr){
            if(element==888){
                integerList.remove(element);
            }
        }


        integerList.forEach(e -> System.out.println(e));
/*        Integer[] intArr =new Integer[integerList.size()];
        integerList.toArray(intArr);*/

    }
}
