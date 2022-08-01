package com.se.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @projectname: learn
 * @packname: com.se.day15
 * @classname: Factorization
 * @author: gyg
 * @date: 2022/7/29 上午 1:20
 * @version: 1.0
 * @description:
 */

public class Factorization {
    private static int num;
    private static List<Integer> container=new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入大于2的整数");
        num=scan.nextInt();
        long start = System.currentTimeMillis();
        print(num,primeFactors(num));
        System.out.println("耗时 "+(System.currentTimeMillis()-start)+" ms");
        scan.close();
    }
    //方法1：因式分解任意>=2的整数，如果参数number<2，则抛出一个 IllegalArgumentException 异常。返回值使用集合来存放此整数的所有质因子。
    public static List<Integer> primeFactors(int number) {
        if(num>=2) {
            for (int i = 2; i <= number; i++) {
                while (num != i) {
                    if (num % i == 0) {
                        container.add(i);
                        num = num / i;
                    } else {
                        break;
                    }

                }
            }
            container.add(num);
            return container;
        }
        else {
            throw new IllegalArgumentException("Number is in the range of 2");
        }
    }
    //方法2：按 number = factor1*factor2*factor3 的格式输出，如上面的例子
    public static void print(int number, List<Integer> result) {
        Iterator<Integer> i=result.iterator();
        System.out.printf("%d = %d",number,i.next());
        while (i.hasNext()) {
            System.out.printf("*%d",i.next());
        }
        System.out.println();
    }
}
