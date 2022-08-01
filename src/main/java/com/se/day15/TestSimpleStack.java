package com.se.day15;

/**
 * @projectname: learn
 * @packname: com.se.day15
 * @classname: TestSimpleStack
 * @author: gyg
 * @date: 2022/7/28 下午 3:09
 * @version: 1.0
 * @description:
 */

public class TestSimpleStack {
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();
        stack.push("jack");
        stack.push("gyg");
        stack.push("anner");
        stack.push("smith");
        System.out.println("栈的大小为："+stack.size());
    }
}
