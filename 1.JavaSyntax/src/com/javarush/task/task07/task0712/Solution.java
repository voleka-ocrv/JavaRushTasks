package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int min = 2147483647, max = 0;
        ArrayList<String> array = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            array.add(reader.readLine());
            if (array.get(i).length() > max) max = array.get(i).length();
            if (array.get(i).length() < min) min = array.get(i).length();
        }
//        System.out.println("min " + min + " max " + max);
        int i = 0;
        while (i < array.size()) {
            if (array.get(i).length() == min || array.get(i).length() == max) {
                System.out.println(array.get(i));
                break;
            }
            else i++;
        }
    }
}
