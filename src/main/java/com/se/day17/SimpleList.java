package com.se.day17;

public interface SimpleList<T>{
    //方法1：从链表头部插入元素【头插法】
    public boolean addFirst(T data);
    //方法2：从链表尾部插入元素【尾插法】
    public boolean addLast(T data);
    //方法3：从链表中删除指定的数据。
    public boolean remove(T data);
    //方法4：返回链表中元素的个数
    public int size();
    //方法5：清空此链表
    public void clear();
    //方法6：打印输出此链表中的所有元素
    public void showData();
}
