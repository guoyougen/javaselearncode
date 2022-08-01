package com.se.day7;

/**
 * @projectname: learn
 * @packname: com.se.day7
 * @classname: Employee
 * @author: gyg
 * @date: 2022/7/16 下午 1:27
 * @version: 1.0
 * @description: TODO
 */

public class Employee {
    private String name;
    private String phone;
    private double basicWage;

    public Employee(String name,String phone,double basicWage){
        setName(name);
        setPhone(phone);
        setBasicWage(basicWage);
    }

    public double getMonthSalary(){
        return basicWage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBasicWage(double salary) {
        this.basicWage = salary;
    }
}
