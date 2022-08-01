package com.se.day6;


public class Computer {
    public static void main(String[] args) {
        Rectangle r =new Rectangle(2,3);
        Circle c = new Circle(4.4);
        System.out.printf("长为2，宽为3的矩形面积是 %.2f 周长是 %.2f\n",r.getArea(),r.getCirc());
        System.out.printf("半径为4.4的圆 面积是 %.2f 周长是 %.2f",c.getArea(),c.getCirc());

    }
}
