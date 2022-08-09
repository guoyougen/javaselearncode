package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: TwoNumber
 * @author: gyg
 * @date: 2022/8/9 上午 10:59
 * @version: 1.0
 * @description:
 */

public class TwoNumber extends Thread {
    private Object lock;

    public TwoNumber(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 51; i++) {

                System.out.printf("%6s", "" + i + (i + 1));

                i++;
                try {
                    lock.notifyAll();

                    if (i != 51) {
                        lock.wait();
                    }

                    sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
