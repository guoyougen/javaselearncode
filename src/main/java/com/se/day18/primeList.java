package com.se.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



/**
 * @projectname: javalearncode
 * @packname: com.se.day18
 * @classname: primeList
 * @author: gyg
 * @date: 2022/8/5 下午 2:36
 * @version: 1.0
 * @description:
 */

public class primeList {
    //
    public static boolean isPrime(int n){
        int candidateRoot = (int) Math.sqrt((double) n);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> n % i == 0);
    }
    public static List<Integer> findPrimes(int start, int end){
        return IntStream.rangeClosed(start, end).filter(i -> isPrime(i)).boxed().toList();
    }
    //
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入开始值");
        int n = scan.nextInt();
        System.out.println("输入结束值");
        findPrimes(n,scan.nextInt()).forEach(System.out::println);
        scan.close();
    }
}
