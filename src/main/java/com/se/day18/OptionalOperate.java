package com.se.day18;

import java.util.Optional;

/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: OptionalOperate
 * @author: gyg
 * @date: 2022/8/4 上午 9:33
 * @version: 1.0
 * @description:
 */

public class OptionalOperate {
    public static void main(String[] args){
      //
        printConditionString("hello,abc");
        printConditionString("hello,zyx");

    }
    public static void printConditionString(String str){
        Optional.ofNullable(str)
                .filter((t)->t.contains("abc"))
                .ifPresent(System.out::println);

    }
    public static int getRealAge(Student s){
        return
                Optional.ofNullable(s)
                        .map((stu) -> stu.getAge())
                        .orElse(18);
    }
public static Optional <Integer> getAge( Student s){
        return
                Optional.ofNullable(s)
                        .flatMap((stu) -> Optional.ofNullable(stu.getAge()));
    }
}
