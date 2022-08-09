package com.se.day23;

import java.util.LinkedList;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: BreadProduce
 * @author: gyg
 * @date: 2022/8/8 下午 5:02
 * @version: 1.0
 * @description:
 */

public class BreadProduce extends Thread {
    private LinkedList<Integer> container;
    private static final int MAX = 100;
    // private int efficiency = 50;

    public BreadProduce(String name, LinkedList<Integer> container) {
        super(name);
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (container) {
                    while (container.size() >= MAX * 0.9) {
                        System.out.printf("面包数量%d个 超过%d %s不生产\n", container.size(), (int)(MAX * 0.9), getName());
                        container.wait();

                    }
                    for (int i = 0; i < 5; i++) {
                        container.add(1);
                    }
                    System.out.printf("%s 生产了5个面包，当前库存为%d\n", getName(), container.size());
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
