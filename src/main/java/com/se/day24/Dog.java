package com.se.day24;

/**
 * @projectname: javalearncode
 * @packname: com.se.day24
 * @classname: Dog
 * @author: gyg
 * @date: 2022/8/9 下午 2:54
 * @version: 1.0
 * @description:
 */

public class Dog extends Mammals implements LandAnimal, EatPlant, Viviparity {

    public void wagTail() {

    }

    @Override
    public void sayHello() {
        wagTail();
        makeSounds();
    }

    @Override
    public void makeSounds() {
        if ("舒服".equals(this.mood.getFeel())) {
            System.out.println("旺旺");
        }
        if ("惊吓".equals(this.mood.getFeel())) {
            System.out.println("呜呜");
        }
    }

    @Override
    public void eatPlant() {

    }

    @Override
    public void run() {

    }

    @Override
    public void viviparity() {

    }
}
