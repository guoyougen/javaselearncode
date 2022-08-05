package com.se.day18;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: OptionalDemo
 * @author: gyg
 * @date: 2022/8/3 下午 4:02
 * @version: 1.0
 * @description:
 */

public class OptionalDemo {
    public static void main(String[] args){
      //
        List<String> strList = getNames();
        Optional<List<String>> opt = Optional.ofNullable(strList);
        opt.ifPresent((list) -> list.forEach(System.out::println));

    }

    private static List<String> getNames() {
        Faker faker=new Faker();
        String name=faker.name().fullName();
        if(Math.random() < 0.5){
             return Arrays.asList(faker.name().firstName(),faker.name().firstName(),faker.name().firstName(),faker.name().firstName(),faker.name().firstName(),name,name,name);
        } else {
            return null;
        }
    }
}
