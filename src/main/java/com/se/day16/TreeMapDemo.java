package com.se.day16;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: TreeDemo
 * @author: gyg
 * @date: 2022/7/29 下午 3:33
 * @version: 1.0
 * @description:
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        SortedMap<String, String> strMap = new TreeMap<String, String>();
        strMap.put("gyg", "he is handsome");
        strMap.put("ht", "he is beautiful");
        strMap.put("he", "he is wonderful");
        strMap.put("sb", "he is special");

        Set<Map.Entry<String, String>> entrys = strMap.entrySet();
        for (Map.Entry<String, String> entry : entrys) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }

    }

}
