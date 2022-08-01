package com.se.day9;

import java.util.Objects;

/**
 * @projectname: learn
 * @packname: com.se.day9
 * @classname: Customer
 * @author: gyg
 * @date: 2022/7/19 上午 9:57
 * @version: 1.0
 * @description: TODO
 */

public class Customer {
    private long id;
    private static long idincrease=88l;
    private String name;
    private String phone;
    private int grade;

    public Customer(String name,String phone,int grade){
        this.id=idincrease++;
        this.name=name;
        this.phone=phone;
        this.grade=grade;
    }
    public Customer(){

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && grade == customer.grade && Objects.equals(name, customer.name) && Objects.equals(phone, customer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, grade);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", grade=" + grade +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getIdincrease() {
        return idincrease;
    }

    public static void setIdincrease(long idincrease) {
        Customer.idincrease = idincrease;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
