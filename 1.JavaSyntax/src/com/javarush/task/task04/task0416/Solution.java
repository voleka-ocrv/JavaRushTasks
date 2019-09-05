package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String sTime = reader.readLine();
        double time = Double.parseDouble(sTime);    //Integer.parseInt(sTime);
        time = time % 5;
        // 2.5 -  (2.5 % 5  * 5)   = 2.5
        if (time >= 0 && time < 3)
            System.out.println("зелёный");
        else if (time >= 3 && time < 4)
            System.out.println("жёлтый");
        else if (time >= 4 && time < 5)
            System.out.println("красный");
        else
            System.out.println("неверный диапазон");

    }
}