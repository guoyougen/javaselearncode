package com.se.day23;

import java.util.LinkedList;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: TestProduceAndConsumer
 * @author: gyg
 * @date: 2022/8/8 下午 3:37
 * @version: 1.0
 * @description:
 */

public class TestProduceAndConsumer {
    public static void main(String[] args) {
        LinkedList<Integer> mutex = new LinkedList<Integer>();
        Thread p = new ProduceThread(mutex);
        Thread t = new ConsumerThread(mutex);

    }
}
