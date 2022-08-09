package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: Barky
 * @author: gyg
 * @date: 2022/8/9 上午 9:39
 * @version: 1.0
 * @description:
 */

public class Barky {
    // 共享变量，当前面包的库存数，默认初始化为0
    private static int STORE;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // 模拟面包师傅生产面包
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 一直生产
                    while (true) {
                        try {
                            // 准备生产
                            synchronized (lock) {
                                // 不满足生产条件
                                while (STORE + 5 > 100) {
                                    lock.wait();
                                }
                                // 满足生产条件
                                STORE += 5;// 生产
                                System.out.printf("%s 生产了5个面包，当前库存：%s\n", Thread.currentThread().getName(), STORE);
                                lock.notifyAll();
                                Thread.sleep(1000);// 间隔一段时间打印
                            }
                            Thread.sleep(100);// 涉及jvm对synchronized优化，暂时不管
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "面包师傅[" + (i + 1) + "]").start();
        }
        // 模拟消费者购买面包
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 一直消费
                    while (true) {
                        try {
                            // 准备消费
                            synchronized (lock) {
                                // 不满足消费条件
                                while (STORE - 2 < 0) {
                                    lock.wait();
                                }
                                // 满足消费条件
                                STORE -= 2;
                                System.out.printf("%s 购买了两个面包，当前库存: %d\n", Thread.currentThread().getName(), STORE);
                                lock.notifyAll();
                                Thread.sleep(1000);
                            }
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "消费者[" + (i + 1) + "]").start();
        }
    }
}