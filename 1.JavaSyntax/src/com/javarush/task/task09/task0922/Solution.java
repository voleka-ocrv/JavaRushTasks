package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
формат даты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy'-'MM'-'dd", Locale.ENGLISH);            //*
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String oldDate = reader.readLine();
        Date date = oldDateFormat.parse(oldDate);
        String newDate = newDateFormat.format(date).toUpperCase();
        System.out.println(newDate);
    }
}
