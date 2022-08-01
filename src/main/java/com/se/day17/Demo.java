package com.se.day17;

import com.github.javafaker.Faker;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: Demo
 * @author: gyg
 * @date: 2022/8/1 下午 1:46
 * @version: 1.0
 * @description:
 */

public class Demo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String streetAddress = faker.address().streetAddress();
        System.out.println(name);
    }
}
