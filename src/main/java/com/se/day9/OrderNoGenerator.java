package com.se.day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @projectname: learn
 * @packname: com.se.day9
 * @classname: OrderNoGenerator
 * @author: gyg
 * @date: 2022/7/19 上午 10:06
 * @version: 1.0
 * @description: TODO
 */

public class OrderNoGenerator {
    private static int seq=0;//编号
    private static int count=0;//一秒内记数
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static long sec=System.currentTimeMillis();//秒数

    public static String generateNo(){
        LocalDateTime now = LocalDateTime.now();
        String str = dtf.format(now);
        if((System.currentTimeMillis()-sec)<1000){//间隔在一秒之内的情况
            if(count>=1000) {
                count=0;//记数清空 但编号不清空
                while((System.currentTimeMillis()-sec)<1000){}//等待 进入下一秒
                sec=System.currentTimeMillis();
            }
            if(seq>=1000)
                seq=0;
            String iStr=String.format("%03d",seq++);
            count++;
            return str+iStr;
        }
        else {  //间隔大于一秒
            count=0;
            sec=System.currentTimeMillis();
            if(seq>=1000)
                seq=0;
            String iStr=String.format("%03d",seq++);
            count++;
            return str+iStr;
        }

    }
}
