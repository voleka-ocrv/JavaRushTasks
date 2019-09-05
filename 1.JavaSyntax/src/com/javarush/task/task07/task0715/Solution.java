package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<String>();
        Collections.addAll(array, "мама", "мыла", "раму");
        int lengthArray = array.size();
        int i = 0;
        while (i < lengthArray){
            array.add((i*2+1), "именно");
            i++;
        }
        for (i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }


    }
}
