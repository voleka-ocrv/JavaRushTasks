package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String sName = reader.readLine();
//        for (int i = 1; i <= 10; i++)
//            System.out.println(sName + " любит меня.");

        double f = 0.0;
        for (int i=1; i <= 10; i++) {
            f += 0.1;
        }

        System.out.println(f);

    }
}
