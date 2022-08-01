package com.se.day7;

/**
 * @projectname: learn
 * @packname: com.se.day7
 * @classname: SalesWorker
 * @author: gyg
 * @date: 2022/7/16 下午 3:18
 * @version: 1.0
 * @description: TODO
 */

public class SalesWorker extends Employee{
    private double commission;
    private double monthlySales;

    public SalesWorker(String name,String phone,double basicWage,double commission,double monthlySales){
        super(name,phone,basicWage);
        setCommission(commission);
        setMonthlySales(monthlySales);
    }
    @Override
    public double getMonthSalary(){
        return super.getMonthSalary()+(commission*monthlySales);
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }
}
