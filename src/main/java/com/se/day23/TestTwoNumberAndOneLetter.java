package com.se.day23;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: TestTwoNumberAndOneLetter
 * @author: gyg
 * @date: 2022/8/9 上午 11:03
 * @version: 1.0
 * @description:
 */

public class TestTwoNumberAndOneLetter {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new TwoNumber(obj);
        t1.start();

        Thread t2 = new OneLetter(obj);
        t2.start();

        t1.join();
        t2.join();
        System.out.println();
        System.out.printf("结束\n");
    }
}
