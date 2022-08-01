package com.se.day14;

import java.time.LocalDate;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: TestStudent
 * @author: gyg
 * @date: 2022/7/27 下午 3:07
 * @version: 1.0
 * @description: TODO
 */

public class TestStudent {
    public static void main(String[] args) {
        Student s= new Student("姚风华","13641832082",'男', LocalDate.of(2001,7,7));
        System.out.println(s);
        if(ObjectPersistUtil.persist(s)>0){
            System.out.printf("成功");
        }
        Student s1=ObjectPersistUtil.read();
        System.out.println(s1);
    }
}
