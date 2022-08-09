package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: OneLetter
 * @author: gyg
 * @date: 2022/8/9 上午 11:02
 * @version: 1.0
 * @description:
 */

public class OneLetter extends Thread {
    private Object lock;

    public OneLetter(Object obj) {
        lock = obj;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (char i = 'A'; i <= 'Z'; i++) {

                System.out.printf("%s", i);
                if ((i - 'A' + 1) % 6 == 0) {
                    System.out.println();
                }
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
