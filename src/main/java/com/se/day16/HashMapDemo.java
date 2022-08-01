package com.se.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: HashMapDemo
 * @author: gyg
 * @date: 2022/7/29 上午 9:58
 * @version: 1.0
 * @description:
 */

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Spring");
        map1.put(2, "Summer");
        map1.put(3, "Autumn");
        map1.put(4, "Winter");
        System.out.printf("大小 %d\n", map1.size());
        map1.put(1, "春天");
        System.out.printf("一次间 %d\n", map1.size());
        //三种迭代方式
        //把map中的key取出来，形成Set<k>
        Set<Integer> keySet = map1.keySet();
        for (Integer key : keySet) {
            String value = map1.get(key);
        }
        //把map中的value取出来 形成Collection <V>
        Collection<String> values = map1.values();
        for (String value : values) {
            System.out.println(value);
        }
        //把map中的key和value同时取出来，并封装成一个类，叫Entry
        Set<Map.Entry<Integer, String>> entrys = map1.entrySet();

        for (Map.Entry<Integer, String> entry : entrys) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        map1.remove(2);
        for (Map.Entry<Integer, String> entry : entrys) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }


}
