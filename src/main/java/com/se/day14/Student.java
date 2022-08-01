package com.se.day14;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: Student
 * @author: gyg
 * @date: 2022/7/27 下午 2:07
 * @version: 1.0
 * @description: TODO
 */

public class Student implements Serializable {
    private long id;
    private String name;
    private transient String phone;
    private char gender;
    private LocalDate birth;


public Student(){
    this.id=IDGenerator.getID();
}

    public Student(String name, String phone, char gender, LocalDate birth) {
        this.id = IDGenerator.getID();
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.birth = birth;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
    System.out.println(25);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        System.out.println("100");
    //return Objects.hash(id, name);
        return 10099;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", birth=").append(birth);
        sb.append('}');
        return sb.toString();
    }
}
