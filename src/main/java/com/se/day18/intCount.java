package com.se.day18;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: intCount
 * @author: gyg
 * @date: 2022/8/5 下午 2:17
 * @version: 1.0
 * @description:
 */

public class intCount {
    public static final int NUM=100;
    public static final int MAX=33;
    public static void main(String[] args){
        List<Integer> intList= new Random().ints(NUM,1,MAX+1).boxed().toList();
        Map<Integer, Long> numGroup=intList.stream().collect(Collectors.groupingBy(Integer::valueOf,Collectors.counting()));
        numGroup.forEach((key, value) ->System.out.printf("%d出现了%d次\n",key,value));
    }
}
