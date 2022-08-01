package com.se.day16;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: Person
 * @author: gyg
 * @date: 2022/7/29 上午 9:52
 * @version: 1.0
 * @description:
 */

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private char gender;
    private String number;
    private String address;

    public Person(String name, int age, char gender, String number, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.number = number;
        this.address = address;
    }

    public Person() {
    }

    @Override
    public int compareTo(Person other) {
        if (this.age == other.age) {
            int len1 = this.name.length();
            int len2 = other.name.length();
            int min = Math.min(len1, len2);
            char[] s1 = this.name.toCharArray();
            char[] s2 = other.name.toCharArray();
            int i = 0;
            for (; i < min; i++) {
                if (s1[i] != s2[i]) {
                    return s1[i] - s2[i];
                }
            }
            return len1 - len2;
        } else {
            return this.age - other.age;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", number='").append(number).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
