package com.se.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @projectname: learn
 * @packname: com.se.day15
 * @classname: ArrayListDemo
 * @author: gyg
 * @date: 2022/7/28 上午 10:45
 * @version: 1.0
 * @description: TODO
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("jack");
        strList.add("solo");
        strList.add("sfs");
        strList.add("sfdffsd");
        for(int i=0;i<strList.size();i++){
            System.out.printf("%s \n",strList.get(i));
        }

        Iterator<String> iter=strList.iterator();
        while (iter.hasNext()){
            String element=iter.next();
            System.out.printf("%s \n",element);
        }
        for(String element:strList){
            System.out.printf("%s \n",element);
        }

    }
}
