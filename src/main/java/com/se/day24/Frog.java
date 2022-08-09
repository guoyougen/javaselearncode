package com.se.day24;

/**
 * @projectname: javalearncode
 * @packname: com.se.day24
 * @classname: Frog
 * @author: gyg
 * @date: 2022/8/9 下午 3:19
 * @version: 1.0
 * @description:
 */

public class Frog extends Amphibian implements EatPlant {
    public void jump() {

    }

    @Override
    public void makeSounds() {
        if ("舒服".equals(this.mood.getFeel())) {
            System.out.println("呱呱呱");
        }
        if ("惊吓".equals(this.mood.getFeel())) {
            jump();
        }
    }

    @Override
    public void eatPlant() {

    }
}
