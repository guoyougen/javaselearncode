package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: LetterThread
 * @author: gyg
 * @date: 2022/8/8 下午 2:22
 * @version: 1.0
 * @description:
 */

public class LetterThread extends Thread {
    private Object lock;

    public LetterThread(Object obj) {
        lock = obj;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.printf("%s", i);
                try {
                    lock.notifyAll();
                    if (i != 'Z')
                        lock.wait();
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
