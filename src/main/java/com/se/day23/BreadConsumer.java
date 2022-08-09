package com.se.day23;

import java.util.LinkedList;
import java.util.Random;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: BreadConsumer
 * @author: gyg
 * @date: 2022/8/8 下午 5:15
 * @version: 1.0
 * @description:
 */

public class BreadConsumer extends Thread {
    private LinkedList<Integer> container;
    private static final int MAX = 100;

    public BreadConsumer(String name, LinkedList<Integer> container) {
        super(name);
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (container) {
                    while (container.size() <= MAX * 0.1) {
                        System.out.printf("面包数量%d个 小于%d %s不消费\n", container.size(), (int)(MAX * 0.1), getName());
                        container.wait();
                    }
                    for (int i = 0; i < 2; i++) {
                        Random r = new Random();
                        container.remove(r.nextInt(container.size()));
                    }
                    System.out.printf("%s 消费了2个面包，当前库存为%d\n", getName(), container.size());
                    container.notifyAll();
                    Thread.sleep(1000);

                }
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
