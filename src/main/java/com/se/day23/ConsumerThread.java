package com.se.day23;

import java.util.LinkedList;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: ConsumerThread
 * @author: gyg
 * @date: 2022/8/8 下午 3:25
 * @version: 1.0
 * @description:
 */

public class ConsumerThread extends Thread {
    private LinkedList<Integer> container;
    private int total;

    public ConsumerThread(LinkedList<Integer> container, int total) {
        this.container = container;
        this.total = total;
    }

    public ConsumerThread(LinkedList<Integer> container) {
        this.container = container;
        this.total = 50;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (container) {

                try {

                    if (this.container.size() < this.total * 0.2) {
                        System.out.printf("%s 数据不够 请生产\n", getName());
                        container.notifyAll();
                        container.wait();

                    } else {
                        int element = container.removeLast();
                        sleep(40);
                        System.out.printf("%s 数据 %d\n", getName(), element);
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}