package com.se.day18;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: Person
 * @author: gyg
 * @date: 2022/8/5 下午 3:37
 * @version: 1.0
 * @description:
 */

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -4146244654240886316L;
    private int id;
    private int age;
    private String name;

    public Person(int id,int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public Person(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
