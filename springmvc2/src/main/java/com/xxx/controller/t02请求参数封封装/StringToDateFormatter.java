package com.xxx.controller.t02请求参数封封装;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月07日 17:46
 */
public class StringToDateFormatter implements Formatter<Date> {

    String datePattern = "yyyy-MM-dd HH:mm:ss";
    /**
     *将字符串转换为指定类型
     * @param s
     * @param locale
     * @return
     * @throws ParseException
     */
//    @Override
//    public LocalDateTime parse(String s, Locale locale){
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(sss);
//        LocalDateTime localDateTime = LocalDateTime.parse(s, formatter);
//        return localDateTime;
//    }

    /**
     *将对象转成成指定类型
//     * @param localDateTime
     * @param locale
     * @return
     */
//    @Override
//    public String print(LocalDateTime localDateTime, Locale locale) {
//        String sss = "yyyy-MM-dd HH:mm:ss";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(sss);
//        return formatter.format(localDateTime);
//    }

    @Override
    public String print(Date date, Locale locale) {
        String format = new SimpleDateFormat().format(date);
        return format;
    }

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        Date date = new SimpleDateFormat(datePattern).parse(s);
        return date;
    }
}
