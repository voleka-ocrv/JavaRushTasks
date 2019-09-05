package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Get n and m
        int n = Integer.parseInt(reader.readLine());        //количество строк массива
        int m = Integer.parseInt(reader.readLine());        //количество строк для перестановки
        //заполнение массива
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < n; i++){
            array.add(reader.readLine());
        }
//        //изменение, добавление в цикле (???)
//        for (int i = 0; i < m; i++){
//            array.add (array.get(0));
//            array.remove(0);
//        }
        for (int i = 0; i < n; i++){
            System.out.println(array.get(i));
        }
//        System.out.println("Точка останова");
    }
}
