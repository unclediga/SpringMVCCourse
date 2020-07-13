package ru.unclediga.converters;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JulianDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        Date date = null;
        try {
            System.out.println("Invoke julian date converter");
            date = new SimpleDateFormat("yyyyMMdd").parse(source);
        } catch (ParseException e) {
//            e.printStackTrace();
            System.err.println("Can't convert empty string!");
        }
        return date;
    }
}
