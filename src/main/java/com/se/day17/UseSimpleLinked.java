package com.se.day17;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: UseSimpleLinked
 * @author: gyg
 * @date: 2022/8/2 上午 11:39
 * @version: 1.0
 * @description:
 */

public class UseSimpleLinked {
    public static void main(String[] args){
      //
        SimpleLinked<String> link=new SimpleLinked<>();
        link.addFirst("third");
        link.addFirst("second");
        link.addFirst("first");
        link.addLast("fourth");
        link.showData();
        link.remove("third");
        System.out.println("当前链表长为"+link.size());
        link.showData();

    }


}
