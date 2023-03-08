package com.xxx.controller.t02请求参数封封装;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月07日 17:46
 */
public class StringToDateConverter implements Converter<String, LocalDateTime> {
    String datePattern = "yyyy-MM-dd HH:mm:ss";
    @Override
    public LocalDateTime convert(String source) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern);
            LocalDateTime localDateTime = LocalDateTime.parse(source, formatter);
            return localDateTime;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
