package com.se.day16;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: BinarySearchTree
 * @author: gyg
 * @date: 2022/7/29 下午 11:41
 * @version: 1.0
 * @description:
 */

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;
    private int size;

    public void add(T data) {
        if (root == null) {
            this.root = new Node<>(data);
            this.size++;
            return;
        }
        Node<T> Parent = null;
        Node<T> cur = this.root;
        while (cur != null) {
            if (data.compareTo(cur.getData()) > 0) {
                Parent = cur;
                cur = cur.getRight();
            } else if (data.compareTo(cur.getData()) < 0) {
                Parent = cur;
                cur = cur.getLeft();
            } else {
                return;
            }
        }
        if (data.compareTo(Parent.getData()) < 0) {
            Parent.setLeft(new Node<T>(data));
        } else {
            Parent.setRight(new Node<T>(data));
        }
        this.size++;
    }

    @Override
    public Node<T> findTargetNode(T val) {
        if (val == null) {
            return null;
        }
        return findTargetNode(val, this.root);
    }

    private Node<T> findTargetNode(T val, Node<T> tree) {
        if (tree == null) {
            return null;
        } else if (val.compareTo(tree.getData()) == 0) {
            return tree;
        } else if (val.compareTo(tree.getData()) > 0) {
            return findTargetNode(val, tree.getRight());
        } else {
            return findTargetNode(val, tree.getLeft());
        }
    }

    @Override
    public Node<T> findParentNode(T target) {
        if (target == null) {
            return null;
        }
        Node<T> Parent = null;
        return findTaParentNode(target, this.root, Parent);
    }


    private Node<T> findTaParentNode(T target, Node<T> tree, Node<T> parent) {
        if (tree == null) {
            return null;
        } else if (target.compareTo(tree.getData()) == 0) {
            return parent;
        } else if (target.compareTo(tree.getData()) < 0) {
            return findTaParentNode(target, tree.getLeft(), tree);
        } else {
            return findTaParentNode(target, tree.getRight(), tree);
        }

    }

    @Override
    public Node<T> findMinNodeFromRight(Node<T> target) {
        Node<T> cur = target.getRight();
        while (cur.getLeft() != null) {
            cur = cur.getLeft();
        }
        return cur;
    }

    @Override
    public void remove(T element) {
        //tree为空
        if (root == null) {
            return;
        }
        Node<T> node = this.findTargetNode(element);
        //没有此元素
        if (node == null) {
            System.out.printf("删除失败 没有%s 这个元素\n", element.toString());
            return;
        }
        //tree树只有一个结点
        if (this.size == 1) {
            this.root = null;
        } else {
            Node<T> parent = findParentNode(element);
            //此元素为根结点
            if (parent == null) {
                if (node.getLeft() != null && node.getRight() == null) {
                    this.root = node.getLeft();
                } else if (node.getRight() != null && node.getLeft() == null) {
                    this.root = node.getRight();
                } else {
                    Node<T> temp =findMinNodeFromRight(node);
                    System.out.printf("临时删除%s \n", temp.getData().toString());
                    this.remove(temp.getData());
                    node.setData(temp.getData());
                }
            }
            //此元素为叶子结点
            else if (node.getLeft() == null && node.getRight() == null) {
                if (parent.getLeft() != null && parent.getLeft().getData().compareTo(element) == 0) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            }
            //此元素有两个子树时
            else if (node.getLeft() != null && node.getRight() != null) {
                //node.setData(this.findMinNodeFromRight(node.getRight()).getData());
                Node<T> temp =findMinNodeFromRight(node);
                System.out.printf("临时删除%s \n", temp.getData().toString());
                this.remove(temp.getData());
                node.setData(temp.getData());
            }
            //单子树时
            else {
                if (node.getLeft() != null) {
                    if (parent.getLeft() == node) {
                        parent.setLeft(node.getLeft());
                    } else {
                        parent.setRight(node.getLeft());
                    }
                } else {
                    if (parent.getLeft() == node) {
                        parent.setLeft(node.getRight());
                    } else {
                        parent.setRight(node.getRight());
                    }
                }
            }
        }
        this.size--;
        System.out.printf("%s 删除成功\n", element.toString());
    }


    @Override
    public void midOrder() {
        System.out.printf("中序遍历 \n");
        midOrder(this.root);
    }

    private void midOrder(Node<T> tree) {
        if (tree == null) {
            return;
        }
        midOrder(tree.getLeft());
        System.out.printf("%s \n", tree.getData().toString());
        midOrder(tree.getRight());
    }

    @Override
    public void postOrder() {
        System.out.printf("后序遍历 \n");
        postOrder(this.root);
    }

    private void postOrder(Node<T> tree) {
        if (tree == null) {
            return;
        }
        postOrder(tree.getLeft());
        postOrder(tree.getRight());
        System.out.printf("%s \n", tree.getData().toString());
    }

    public void preOrder() {
        System.out.printf("前序遍历 \n");
        preOrder(this.root);
    }

    private void preOrder(Node<T> tree) {
        if (tree == null) {
            return;
        }
        System.out.printf("%s \n", tree.getData().toString());
        preOrder(tree.getLeft());
        preOrder(tree.getRight());
    }

    public int size() {
        return this.size;
    }

}