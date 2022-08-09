package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: HelloThread
 * @author: gyg
 * @date: 2022/8/8 上午 10:14
 * @version: 1.0
 * @description:
 */

public class HelloThread extends Thread {
    public HelloThread(String s) {
        super(s);
    }

    @Override
    public void run() {
        System.out.printf("%s 启动了\n", getName());
        for (int i = 0; i < 15; i++) {
            System.out.printf("%-3d", i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s 结束了\n", getName());
    }
}
