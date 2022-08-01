package com.se.day10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @projectname: learn
 * @packname: com.se.day10
 * @classname: UseDateUtil
 * @author: gyg
 * @date: 2022/7/21 上午 9:36
 * @version: 1.0
 * @description: TODO
 */

public class UseDateUtil {
    public static void main(String[] args) {
        DateTimeFormatter DateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
      String str = "2022-07-21";
        LocalDate todayLocalDate=LocalDate.parse(str,DateTimeFormatter1);
        Date todayDate=DateUtil.toDate(todayLocalDate);
        System.out.println("LocalDate-> Date "+todayDate);
        todayLocalDate=DateUtil.toLocalDate(todayDate);
        System.out.println("Date->LocalDate "+todayLocalDate);
    }
}
