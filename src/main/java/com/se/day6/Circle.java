package com.se.day6;

public class Circle {
    private double radius;
    public Circle(double r){
        radius=r;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getCirc(){
        return 2*Math.PI*radius;
    }
}
