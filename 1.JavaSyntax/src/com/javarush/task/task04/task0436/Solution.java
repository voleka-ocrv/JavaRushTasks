package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine()); //строки
        int n = Integer.parseInt(reader.readLine()); //столбцы
        //строки
        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0; j--)
                System.out.print(8);
            System.out.println();
        }
    }
}
