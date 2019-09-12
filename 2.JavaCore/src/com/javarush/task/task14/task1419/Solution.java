package com.javarush.task.task14.task1419;

import java.io.*;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
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
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new RuntimeException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new FileSystemNotFoundException());
        exceptions.add(new NullPointerException());
    }
}
