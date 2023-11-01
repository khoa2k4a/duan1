/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class XDate {
    static SimpleDateFormat formater = new SimpleDateFormat();
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return (Date) formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return  formater.format(date);
    }
    
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
}
