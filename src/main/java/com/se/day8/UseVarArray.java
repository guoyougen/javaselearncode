package com.se.day8;

/**
 * @projectname: learn
 * @packname: com.se.day8
 * @classname: UseVarArray
 * @author: gyg
 * @date: 2022/7/18 下午 2:12
 * @version: 1.0
 * @description: TODO
 */

public class UseVarArray {
    public static void main(String[] args) {
        VarArray v=new VarArrayImp1();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(1);
        v.add(2);
        v.add(3);
        v.printData();


        v.remove(1);
        v.printData();


        System.out.println(v.find(2));
        System.out.println(v.find(2,1,3));

        v.update(3,5);
        v.printData();

        System.out.println(v.size());

        v.clear();

        v.printData();
    }
}
