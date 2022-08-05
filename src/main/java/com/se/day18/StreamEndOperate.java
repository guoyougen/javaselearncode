package com.se.day18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: StreamEndOperate
 * @author: gyg
 * @date: 2022/8/5 下午 1:29
 * @version: 1.0
 * @description:
 */

public class StreamEndOperate {
    public static void main(String[] args){
      //
        long total = Stream.iterate(1, x->x+1).limit(10).reduce(0,(t,u)->t+u).intValue();

    }
}
