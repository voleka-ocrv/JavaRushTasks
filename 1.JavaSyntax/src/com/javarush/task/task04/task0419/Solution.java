package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        String sNum3 = reader.readLine();
        String sNum4 = reader.readLine();
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);
        int num4 = Integer.parseInt(sNum4);
        int max = -2147483648;
        // проверка максимального
        if (num1 >= max && num1 >= num2 && num1 >= num3 && num1 >= num4) max = num1;
        if (num2 >= max && num2 >= num1 && num2 >= num3 && num2 >= num4) max = num2;
        if (num3 >= max && num3 >= num1 && num3 >= num2 && num3 >= num4) max = num3;
        if (num4 >= max && num4 >= num1 && num4 >= num2 && num4 >= num3) max = num4;
        System.out.println(max);
    }
}
