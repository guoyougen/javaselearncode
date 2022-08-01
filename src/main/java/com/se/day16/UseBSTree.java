package com.se.day16;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: UseBSTree
 * @author: gyg
 * @date: 2022/7/30 上午 12:25
 * @version: 1.0
 * @description:
 */

public class UseBSTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(3);
        bst.add(4);
        bst.add(365);
        bst.add(151);
        bst.add(739);
        bst.add(145);
        bst.add(430);
        bst.add(934);
        bst.add(220);
        bst.add(795);

        bst.preOrder();
        System.out.println();
        bst.midOrder();
        System.out.println();
        bst.postOrder();
        System.out.println();

        bst.remove(739);
        bst.preOrder();
        System.out.println();
        bst.midOrder();
    }
}
