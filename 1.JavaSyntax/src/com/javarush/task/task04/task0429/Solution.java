package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

//        a, b
        if (num1 > 0 && num2 > 0 && num3 > 0)           //все положительные
            if (num1 * num2 * num3 > 0) System.out.println("количество отрицательных чисел: 0");
        if (num1 < 0 && num2 < 0 && num3 < 0)           //все отрицательные
            if (num1 * num2 * num3 < 0) System.out.println("количество отрицательных чисел: 3");
    }
}
