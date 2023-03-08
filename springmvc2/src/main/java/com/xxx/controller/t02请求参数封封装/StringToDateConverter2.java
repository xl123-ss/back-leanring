package com.xxx.controller.t02请求参数封封装;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月07日 17:46
 */
public class StringToDateConverter2 implements Converter<String, Date> {
    String datePattern = "yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String source) {
            Date date = null;
        try {
            date = new SimpleDateFormat(datePattern).parse(source);
            return date;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
