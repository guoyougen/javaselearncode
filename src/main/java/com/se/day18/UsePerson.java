package com.se.day18;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: UsePerson
 * @author: gyg
 * @date: 2022/8/5 下午 3:47
 * @version: 1.0
 * @description:
 */

public class UsePerson {
    public static void main(String[] args){
      //
        Person p1= new Person(1,22,"杨鹤轩");
        Person p2= new Person(2,23,"苏航");
        Person p3= new Person(3,25,"廖皓轩");
        Person p4= new Person(4,25,"梁鹏涛");
        Person p5= new Person(5,26,"蒋思源");
        Person p6= new Person(6,27,"胡志泽");
        Person p7= new Person(7,27,"龙瑞霖");
        Person p8= new Person(8,29,"龙伟宸");
        Person p9= new Person(9,25,"雷驰轩");
        Person p10= new Person(10,31,"廖智宸");
        List<Person> persons= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
        Map<Long,Person> mapPedrson=persons.stream().collect(Collectors.toMap(m->(long)m.getId(),t->t));
        findMax(persons);
        averageAGE(persons);
        findName(persons,"轩").forEach(System.out::println);
        ageGroup(persons);

    }
    public static void findMax(List<Person> persons){
        Person max=persons.stream().max(Comparator.comparing(Person::getAge)).get();
        System.out.printf("年龄最大是%s\n",max.toString());
    }
    public static void averageAGE(List<Person> persons){
        double averageAGE=persons.stream().collect(Collectors.averagingDouble(Person::getAge));
        System.out.printf("平均年龄是%.2f\n",averageAGE);
    }
    public static List<Person> findName(List<Person> persons,String obtained) {
        return persons.stream().filter(person->person.getName().contains(obtained)).collect(Collectors.toList());
    }
    public static void ageGroup(List<Person> persons){
        Map<Integer,Long> ageGroupMap=persons.stream().collect(Collectors.groupingBy(p->p.getAge(),Collectors.counting()));
        ageGroupMap.forEach((key, value) ->System.out.printf("年龄为%d 次数为%d\n",key,value));
    }

}
