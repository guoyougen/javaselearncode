package com.se.day24;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @projectname: javalearncode
 * @packname: com.se.day24
 * @classname: ThirdNum
 * @author: gyg
 * @date: 2022/8/9 下午 3:31
 * @version: 1.0
 * @description:
 */

public class ThirdNum {
    private int range = 9;
    private int num = 5;

    public LinkedList<Integer> thirdMAX() {

        LinkedList<Integer> container =
            IntStream.rangeClosed(0, range).boxed().collect(Collectors.toCollection(LinkedList::new));
        Random r = new Random();
        TreeSet<Integer> elect = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
        });

        for (int i = 0; i < num; i++) {
            int l = r.nextInt(container.size());
            elect.add(container.get(l));
            container.remove(l);
        }
        System.out.println(elect);
        int[] result = new int[num];
        Iterator<Integer> rx = elect.iterator();
        int i = 0;
        while (rx.hasNext()) {
            result[i++] = rx.next();
        }
        System.out.println(Arrays.toString(result));

        return container;

    }
}
