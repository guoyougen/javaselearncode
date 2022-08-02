package com.se.day17;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: Node
 * @author: gyg
 * @date: 2022/8/2 上午 10:51
 * @version: 1.0
 * @description:
 */

public class Node<T extends Comparable> {
    private T data;
    private Node<T> next;
    public Node(T data) {
        this.data = data;
    }
    public Node(){

    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
