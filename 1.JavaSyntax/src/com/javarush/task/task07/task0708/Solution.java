package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> length = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++){ strings.add(reader.readLine());}
        for (int i = 0; i < 5; i++){length.add(strings.get(i).length());}

        int max = length.get(0);
        for (int i = 1; i < length.size(); i++){
            if (length.get(i) > max) max = length.get(i);
        }

//        System.out.println(max);
        for (int i = 0; i < length.size(); i++){
            if (strings.get(i).length() == max) System.out.println(strings.get(i));
        }
    }
}
