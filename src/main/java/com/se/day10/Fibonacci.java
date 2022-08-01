package com.se.day10;

import java.math.BigInteger;

/**
 * @projectname: learn
 * @packname: com.se.day10
 * @classname: fbnq
 * @author: gyg
 * @date: 2022/7/20 上午 11:36
 * @version: 1.0
 * @description: TODO
 */

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.fbnq(119));
    }
    public static BigInteger fbnq(int n){
        BigInteger a=BigInteger.valueOf(1);
        BigInteger b=BigInteger.valueOf(1);
        BigInteger temp;
        for (int i =1 ;i<n;i++){
            temp=b;
            b=b.add(a);
            a=temp;
        }
        return b;
    }
}
