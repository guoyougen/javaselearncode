package com.se.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * @projectname: learn
 * @packname: com.se.day15
 * @classname: Task15_1_100wData
 * @author: gyg
 * @date: 2022/7/28 下午 11:12
 * @version: 1.0
 * @description:
 */

public class DataCount {
  private static TreeSet<Integer> numbers = new TreeSet<>();
  private static ArrayList<Long> countNums = new ArrayList<>();

  private static final int NUMBOUND = 101;
  private static final int TOTAL = 1000 * 1000;

  public static void main(String[] args) {
    long now = System.currentTimeMillis();
    generateNumber();
    printNumber();
    System.out.println("耗时 " + (System.currentTimeMillis() - now) + " ms");
  }

  //生成随机数，一边生成一边往treeSet numbers 里面添加，利用add方法判断重复
  // 在ArrayList countNum 里面记录重复次数（随机数做索引，get方法取值自增set赋值）

  public static void generateNumber() {

    for (int i = 0; i < NUMBOUND; i++) {
      countNums.add(0L);
    }

    Random r = new Random();
    int temp;
    long temp2;
    for (int i = 0; i < TOTAL; i++) {
      //一边生成一边往treeSet numbers 里面添加
      temp = r.nextInt(NUMBOUND);
      //利用add方法判断重复
      numbers.add(temp);
      //随机数做索引
      temp2 = countNums.get(temp);
      //get方法取值自增set赋值
      countNums.set(temp, ++temp2);
    }
  }

  public static void printNumber() {
    Iterator<Integer> i = numbers.iterator();
    int temp;
    while (i.hasNext()) {
      temp = i.next();
      System.out.printf("整数 %d  出现了 %d 次\n", temp, countNums.get(temp));
    }
    
  }
}
