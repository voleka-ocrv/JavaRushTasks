package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new  int[20];
        int[] small1Array = new  int[10];
        int[] small2Array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++){
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < bigArray.length; i++){
            if (i < bigArray.length/2) small1Array[i] = bigArray[i];
            else
                {
                small2Array[i - bigArray.length/2] = bigArray[i];
                System.out.println(small2Array[i - bigArray.length/2]);
                }
            }
    }
}
