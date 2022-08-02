package com.se.day17;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: SimpleLinked
 * @author: gyg
 * @date: 2022/8/2 上午 10:56
 * @version: 1.0
 * @description:
 */

public class SimpleLinked<T extends Comparable> implements SimpleList<T> {
    private Node<T> root;
    private int size;

    @Override
    public boolean addFirst(T data) {
        if (size == 0) {
            root = new Node<T>(data);
            size = 1;
            return true;
        } else {
            Node<T> newNode = new Node<T>(data);
            newNode.setNext(root);
            root=newNode;
            size++;
            return true;
        }
    }

    @Override
    public boolean addLast(T data) {
        if (size == 0) {
            root = new Node<T>(data);
            size = 1;
            return true;
        } else {
            Node<T> newNode = new Node<T>(data);
            Node<T> cur =root;
            while (cur.getNext()!=null) {
                cur= cur.getNext();
            }
            cur.setNext(newNode);
            size++;
            return true;
        }
    }

    @Override
    public boolean remove(T data) {
        if(size==0) {
            System.out.println("链表中无元素\n");
            return false;
        }
        else {
            Node<T> cur = root;
            Node<T> pre=null;
            if(cur.getData().equals(data)) {
                root=root.getNext();
                size--;
                System.out.printf("元素%s已被成功删除\n",data.toString());
                return true;
            }
            else {
                while (cur!=null){
                    if (data.equals(cur.getData())) {
                        pre.setNext(cur.getNext());
                        size--;
                        System.out.printf("元素%s已被成功删除\n",data.toString());
                        return true;
                    }
                    pre=cur;
                    cur=cur.getNext();
                }
            }
        }
        System.out.printf("没找到%s 元素\n", data.toString());
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size=0;
        root=null;
        System.out.println("链表已清空");
    }

    @Override
    public void showData() {
        if(size==0) {
            System.out.println("链表中无元素");
            return;
        }
        else {
            System.out.println("链表如下");
            Node<T> cur = root;
            while (cur!=null){
                System.out.printf("%s -> ",cur.getData());
                cur = cur.getNext();
            }
            System.out.println();
        }
    }
}
