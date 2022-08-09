package com.se.day24;

/**
 * @projectname: javalearncode
 * @packname: com.se.day24
 * @classname: Cat
 * @author: gyg
 * @date: 2022/8/9 下午 3:27
 * @version: 1.0
 * @description:
 */

public class Cat extends Mammals implements EatMeat, LandAnimal, Viviparity {
    @Override
    public void sayHello() {
        System.out.println("喵");
        makeSounds();
    }

    @Override
    public void makeSounds() {
        if ("舒服".equals(this.mood.getFeel())) {
            System.out.println("咕噜咕噜");
        }
        if ("惊吓".equals(this.mood.getFeel())) {
            System.out.println("嘶嘶");
        }
    }

    @Override
    public void eatMeat() {

    }

    @Override
    public void run() {

    }

    @Override
    public void viviparity() {

    }
}
