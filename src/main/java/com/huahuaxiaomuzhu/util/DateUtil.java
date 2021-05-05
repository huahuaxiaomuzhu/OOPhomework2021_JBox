package com.huahuaxiaomuzhu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    /**
     * 获取当前日期时间
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrentDateTime(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }

    /**
     * 获取当前时间戳（毫秒为单位）
     * @return 时间戳
     */
    public static String getCurrentTimeStamp(){
        return String.valueOf(new Date().getTime());
    }

    /**
     * 将时间戳转换为日期时间
     * @param timeStamp
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String timeStampToDateTime(String timeStamp){
        try {
            long time=Long.parseLong(timeStamp);
            Date date=new Date(time);
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        }catch (NumberFormatException e){
            return "格式错误";
        }
    }

    /**
     * 将yyyy-MM-dd HH:mm:ss转换为时间戳
     * @param dateTime
     * @return 时间戳（毫秒为单位）
     */
    public static String dateTimeToTimeStamp(String dateTime){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date=simpleDateFormat.parse(dateTime);
            return String.valueOf(date.getTime());
        } catch (ParseException e) {
            return "格式错误";
        }
    }
}
