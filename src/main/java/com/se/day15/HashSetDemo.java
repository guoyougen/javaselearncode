package com.se.day15;

import com.se.day14.Student;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @projectname: learn
 * @packname: com.se.day15
 * @classname: HashSetDemo
 * @author: gyg
 * @date: 2022/7/28 下午 4:06
 * @version: 1.0
 * @description:
 */

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String>strSet = new HashSet<>();
        strSet.add("af");
        strSet.add("brty");
        strSet.add("cte");
        strSet.add("drt");
        strSet.add("etr");

        strSet.forEach(e -> System.out.println(e));
        strSet.add("af");
        strSet.forEach(System.out::println);

        Set<Student>stuSet = new HashSet<Student>();
        Student s1  = new Student("a4","13390634753",'男', LocalDate.of(2090, 1, 1));
        Student s2 = new Student("b546","13398634753", '女', LocalDate.of(2080, 1, 1));
        Student s3 = new Student("c64", "13390630753", '男', LocalDate.of(2050, 1, 1));
        Student s4 = new Student("d6", "13390334753", '女', LocalDate.of(2000, 1, 1));
        stuSet.add(s1);
        stuSet.add(s2);
        stuSet.add(s3);
        stuSet.add(s4);
        stuSet.forEach(System.out::println);
        TreeSet<Teacher> teaSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                System.out.println("调用了Comparator接口的 实现了类的comparator");
                return 0;
            };
        });

    }
}
