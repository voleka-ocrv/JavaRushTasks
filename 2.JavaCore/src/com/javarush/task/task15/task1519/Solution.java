package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        if (strNumber.contains(".")) {
//            double doubleValue = Double.parseDouble(strNumber);
//            print(doubleValue);
//        }
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        Scanner s = new Scanner(System.in).useDelimiter("(\\d+)");
//        System.out.println(i);
        //Double
        try {
            Double doubleValue = sc.nextDouble();
            print(doubleValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //short
        try {
            short shortValue = sc.nextShort();
            print(shortValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Integer
        try {
            Integer integerValue = sc.nextInt();
            print(integerValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //String



//        int number = Integer.parseInt(strNumber);
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
