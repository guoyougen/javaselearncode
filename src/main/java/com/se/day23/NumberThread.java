package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: NumberThread
 * @author: gyg
 * @date: 2022/8/8 下午 2:30
 * @version: 1.0
 * @description:
 */

public class NumberThread extends Thread {
    private Object lock;

    public NumberThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i <= 25; i++) {
                System.out.printf("%3d", i + 1);

                try {
                    lock.notifyAll();
                    if (i != 25)
                        lock.wait();
                    sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
