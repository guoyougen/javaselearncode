package com.se.day7;

/**
 * @projectname: learn
 * @packname: com.se.day7
 * @classname: UseEmployee
 * @author: gyg
 * @date: 2022/7/16 下午 4:06
 * @version: 1.0
 * @description: TODO
 */

public class UseEmployee {
    public static void main(String[] args) {
        Employee [] yg = new Employee [3];
        for (int i=0;i<3;i++){
            yg[i]=EmployeeFactory.createEmployee(i);
            EmployeeFactory.printMonthSalary(yg[i]);
        }
    }
}
