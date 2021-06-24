package com.mint.test;

import com.sun.deploy.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest {

    public static void main(String[] args) {
        /*
        String s = "versionError|2021/6/1|Lili";

        String[] strings = StringUtils.splitString(s, "|");

        for (String string : strings) {
            System.out.println(string);
        }
         */
        String date = "23 Jun 2021 10:58 AM";
        String format = "d MMM yyyy h:mm a";

        testSimpleDateFormat(date, format);

    }

    /**
     * @author: Guo Zheng Min
     * @methodsName:  testSimpleDateFormat
     * @description: 测试时间转换
     * @param date date
     * @param format format
     * @date: 6/23/2021
     */

    public static void testSimpleDateFormat(String date, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date resultDate = null;
        try {
            resultDate = simpleDateFormat.parse(date);
            System.out.println(resultDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
