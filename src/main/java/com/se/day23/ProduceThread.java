package com.se.day23;

import java.util.LinkedList;
import java.util.Random;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: ProduceThread
 * @author: gyg
 * @date: 2022/8/8 下午 3:10
 * @version: 1.0
 * @description:
 */

public class ProduceThread extends Thread {
    private LinkedList<Integer> container;
    public int total;

    public ProduceThread(LinkedList<Integer> container, int total) {
        this.container = container;
        this.total = total;
    }

    public ProduceThread(LinkedList<Integer> container) {
        this.container = container;
        this.total = 50;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            try {
                int n = r.nextInt(1000) + 1;
                sleep(20);
                System.out.printf("%s 生产了数据 %d\n", getName(), n);
                synchronized (this.container) {
                    if (container.size() >= this.total * 0.8) {
                        System.out.printf("%s快满了暂停生产 \n", getName());
                        container.notifyAll();
                        container.wait();
                    } else
                        this.container.add(n);
                    System.out.printf("%s 把数据 %d添加\n", getName(), n);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
