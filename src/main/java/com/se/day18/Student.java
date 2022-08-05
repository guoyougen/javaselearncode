package com.se.day18;

/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: Student
 * @author: gyg
 * @date: 2022/8/4 上午 9:45
 * @version: 1.0
 * @description:
 */

public class Student {
    private Integer id;
    private String gender;
    private String name;
    private int age;

    public Student(Integer id, String gender, String name, int age) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){

    }


}
