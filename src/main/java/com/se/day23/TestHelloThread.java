package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: TestHelloThread
 * @author: gyg
 * @date: 2022/8/8 上午 10:18
 * @version: 1.0
 * @description:
 */

public class TestHelloThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s \n", Thread.currentThread().getName());
        /* Thread t1 = new HelloThread();
        t1.start();*/
        Thread[] arr = new Thread[2];
        for (int i = 0; i < arr.length; i++) {
            Thread t = new HelloThread("线程" + (i + 1));
            t.start();
            arr[i] = t;
        }
        for (Thread t : arr) {
            t.join();
        }
        System.out.printf("结束%s\n", Thread.currentThread().getName());
    }
}
