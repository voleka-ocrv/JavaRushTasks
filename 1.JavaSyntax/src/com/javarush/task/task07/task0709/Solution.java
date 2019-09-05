package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Integer> length = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());                                     //заполнение массива строк
            length.add(strings.get(i).length());                                //заполнение массива длин
        }
        //сортировка массива длин
        int buf = length.get(0);
        for (int j = 0; j < length.size() - 1; j++){
            for (int i = 0; i < length.size() - 1; i++){
                if (length.get(i) > length.get(i + 1)) {
                    buf = length.get(i);
                    length.set(i, length.get(i + 1));
                    length.set(i + 1, buf);
                }
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == length.get(0)) System.out.println(strings.get(i));
        }
    }
}
