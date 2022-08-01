package com.se.day7;

import java.util.Scanner;

/**
 * @projectname: learn
 * @packname: com.se.day7
 * @classname: EmployeeFactory
 * @author: gyg
 * @date: 2022/7/16 下午 3:32
 * @version: 1.0
 * @description: TODO
 */

public class EmployeeFactory {
    public static Employee createEmployee(int i){
        Scanner scan = new Scanner(System.in);
        String name;
        String phone;
        double basicWage;
        double jiachen1;
        double jiahcen2;
        if(i==0) {
            System.out.println("固定工资员工  请输入姓名");
            name=scan.nextLine();
            System.out.println("            请输入手机号");
            phone=scan.nextLine();
            System.out.println("            请输入基本工资");
            basicWage=scan.nextDouble();
            Employee e = new FixWageWorker(name,phone,basicWage);
            return e;
        }
        else if(i==1) {
            System.out.println("小时工  请输入姓名");
            name=scan.nextLine();
            System.out.println("       请输入手机号");
            phone=scan.nextLine();
            System.out.println("       请输入每月工作小时");
            jiachen1=scan.nextDouble();
            System.out.println("       请输入每小时费用");
            jiahcen2=scan.nextDouble();
            Employee e = new HourlyWorker(name,phone,jiachen1,jiahcen2);
            return e;
        }
        else {
            System.out.println("销售员工  请输入姓名");
            name=scan.nextLine();
            System.out.println("       请输入手机号");
            phone=scan.nextLine();
            System.out.println("       请输入基本工资");
            basicWage=scan.nextDouble();
            System.out.println("       请输入提成率");
            jiachen1=scan.nextDouble();
            System.out.println("       请输入月销售额");
            jiahcen2=scan.nextDouble();
            Employee e = new SalesWorker(name,phone,basicWage,jiachen1,jiahcen2);
            return e;
        }
    }
    public static void printMonthSalary(Employee e){
        System.out.println("工资是 "+e.getMonthSalary());
    }
}
