package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
//        int i = 0;
//        if (num1 > 0) i++;
//        if (num2 > 0) i++;
//        if (num3 > 0) i++;
        if (num1 > 0 && num2 > 0 && num3 > 0) System.out.println(3);
        if (num1 < 0 && num2 > 0 && num3 > 0) System.out.println(3);
//        System.out.println(i);

    }
}
