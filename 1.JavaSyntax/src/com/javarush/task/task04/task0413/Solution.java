package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int sNumber = Integer.parseInt(number);


        if (sNumber == 1) System.out.println("понедельник");
        else
        if (sNumber == 2) System.out.println("вторник");
        else
        if (sNumber == 3) System.out.println("среда");
        else
        if (sNumber == 4) System.out.println("четверг");
        else
        if (sNumber == 5) System.out.println("пятница");
        else
        if (sNumber == 6) System.out.println("суббота");
        else
        if (sNumber == 7) System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");
    }
}