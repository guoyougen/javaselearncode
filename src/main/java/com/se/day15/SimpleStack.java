package com.se.day15;

import java.util.LinkedList;

/**
 * @projectname: learn
 * @packname: com.se.day15
 * @classname: SimpleStack
 * @author: gyg
 * @date: 2022/7/28 下午 2:58
 * @version: 1.0
 * @description:
 */

public class SimpleStack {
    private LinkedList<String> container;
    public SimpleStack() {
        this.container = new LinkedList<>();
    }

    public void push(String element) {
        this.container.push(element);
    }

    public String pop() {
        return this.container.pop();
    }

    public String peek() {
        return this.container.peek();
    }

    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    public int size() {
        return this.container.size();
    }


}
