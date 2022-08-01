package com.se.day16;

public interface Tree<T extends Comparable<T>> {
    public void add(T data);

    public Node<T> findTargetNode(T val);

    public Node<T> findParentNode(T target);

    public Node<T> findMinNodeFromRight(Node<T> target);

    public void remove(T element);

    public void preOrder();

    public void midOrder();

    public void postOrder();

    //TODO: 返回树中节点的个数
    public int size();
}
