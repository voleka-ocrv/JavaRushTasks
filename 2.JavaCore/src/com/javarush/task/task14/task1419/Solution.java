package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        // 1. ArithmeticException
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
        int[] intArray = new int[0];
        System.out.println(intArray[intArray.length]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 3. NumberFormatException
        try {
            String s = "FOOBAR";
            int i = Integer.parseInt(s);
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 4. IllegalArgumentException
        try {
            String string = "004034556";
            String[] parts = string.split("?");
            String part1 = parts[0]; // 004
            String part2 = parts[1]; // 034556
        } catch (Exception e) {
            exceptions.add(e);
        }

        //5. IOException
        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String name = bufferedReader.readLine(); //читаем строку с клавиатуры

//            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
//            String userInput;
//            while ((userInput = stdIn.readLine()) != null) {
//                System.out.println(userInput);
//            }
            File f = new File(System.getProperty("user.home") + "/.foo/bar/", "1");
        } catch (IOException e) {
            exceptions.add(e);
        }
    }
}
