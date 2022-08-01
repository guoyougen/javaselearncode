package com.se.day11;

/**
 * @projectname: learn
 * @packname: com.se.day11
 * @classname: UsePatternDemo
 * @author: gyg
 * @date: 2022/7/22 下午 3:17
 * @version: 1.0
 * @description: TODO
 */

public class UsePatternDemo {
    public static void main(String[] args) {
        PatternDemo p =new PatternDemo();
        System.out.println(p.getContent());
        System.out.printf("一共有 %d 个单词\n",p.countWords(p.getContent()));
        System.out.printf("统计每个单词(大小写不计)频率\n");
        int length=p.countSize(p.getContent()).length;
        System.out.println("一共有 "+length+"个单词");
        for (int i =0 ;i<length;i++){
            if(i%10==0)
                System.out.println();
            System.out.printf("%10s  %2d次",p.countSize(p.getContent())[i].getWord(),p.countSize(p.getContent())[i].getCount());
        }
    }
}
