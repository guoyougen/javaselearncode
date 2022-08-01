package com.se.day16;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: Node
 * @author: gyg
 * @date: 2022/7/29 上午 9:54
 * @version: 1.0
 * @description:
 */

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node(T data) {
        this.data = data;
    }

    public Node() {

    }
    

}
