package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        String buffer;

        for (int i = 0; i < 5; i++){
            array.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++){
//            array.add(reader.readLine());
            buffer = array.get(array.size() - 1);
            array.remove(array.size() - 1);
            array.add(0, buffer);
        }
        for (int i = 0; i < 5; i++){
            System.out.println(array.get(i));
        }

    }
}
