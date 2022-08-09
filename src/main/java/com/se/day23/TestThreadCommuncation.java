package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: TestThreadCommuncation
 * @author: gyg
 * @date: 2022/8/8 下午 2:32
 * @version: 1.0
 * @description:
 */

public class TestThreadCommuncation {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new NumberThread(obj);
        t1.start();

        Thread t2 = new LetterThread(obj);
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("结束\n");
    }
}
