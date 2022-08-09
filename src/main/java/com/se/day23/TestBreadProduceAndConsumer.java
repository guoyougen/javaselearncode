package com.se.day23;

import java.util.LinkedList;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: TestBreadProduceAndConsumer
 * @author: gyg
 * @date: 2022/8/9 上午 9:11
 * @version: 1.0
 * @description:
 */

public class TestBreadProduceAndConsumer {
    public static void main(String[] args) {
        LinkedList<Integer> container = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            Thread p = new BreadProduce("面包师" + i, container);

            p.start();
        }
        for (int i = 1; i <= 7; i++) {
            Thread c = new BreadConsumer("消费者" + i, container);

            c.start();
        }

    }
}
