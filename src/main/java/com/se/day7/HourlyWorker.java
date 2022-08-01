package com.se.day7;

/**
 * @projectname: learn
 * @packname: com.se.day7
 * @classname: HourlyWorker
 * @author: gyg
 * @date: 2022/7/16 下午 2:48
 * @version: 1.0
 * @description: TODO
 */

public class HourlyWorker extends Employee{
    private double workingHoursMonthly;
    private double feesPerHour;
    public HourlyWorker(String name,String phone,double workingHoursMonthly,double feesPerHour){
        super(name,phone,0);
        setWorkingHoursMonthly(workingHoursMonthly);
        setFeesPerHour(feesPerHour);
    }
    @Override
    public double getMonthSalary(){
        return (workingHoursMonthly*feesPerHour);
    }

    public void setWorkingHoursMonthly(double workingHoursMonthly) {
        this.workingHoursMonthly = workingHoursMonthly;
    }

    public void setFeesPerHour(double feesPerHour) {
        this.feesPerHour = feesPerHour;
    }
}
