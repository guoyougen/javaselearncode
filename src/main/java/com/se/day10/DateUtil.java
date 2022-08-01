package com.se.day10;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @projectname: learn
 * @packname: com.se.day10
 * @classname: DateUtil
 * @author: gyg
 * @date: 2022/7/20 下午 1:13
 * @version: 1.0
 * @description: TODO
 */

public class DateUtil {
    private static final DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static Date toDate(LocalDate localDate){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        String strDate=localDate.format(dateTimeFormatter1);
        Date date =null;
        try{
            date=s.parse(strDate);
        }catch (Exception e){
            e.printStackTrace();
        }
        return date;
    }
    public static LocalDate toLocalDate(Date date){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        String strDate = s.format(date);
        LocalDate localDate = LocalDate.parse(strDate,dateTimeFormatter1) ;
        return localDate;
    }


}
