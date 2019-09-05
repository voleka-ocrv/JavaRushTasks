package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        int num1 = Integer.parseInt (sNum1);
//        System.out.println();
        String sNum2 = reader.readLine();
        int num2 = Integer.parseInt (sNum2);
        if (num1 < num2) System.out.println(num1);
        else
            if (num1 > num2) System.out.println(num2);
            else System.out.println(num1);

    }
}