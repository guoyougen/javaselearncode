package com.se.day6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double l,double w){
        length=l;
        width=w;
    }
    public double getArea(){
        return length*width;
    }
    public double getCirc(){
        return 2*(length+width);
    }

}
