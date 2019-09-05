package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        int num1 = Integer.parseInt(sNum1);
        String sNum2 = reader.readLine();
        int num2 = Integer.parseInt(sNum2);
        String sNum3 = reader.readLine();
        int num3 = Integer.parseInt(sNum3);

        //Найти максимальное из 3, вывести его. Найти максимальное из 2. вывести их в порядке убывания
        //Найти максимальное из 3
        /*Если

         */
        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + " ");
            if (num2 > num3) System.out.print(num2 + " "+ num3);
            else System.out.print(num3 + " "+ num2);
            }
        else
            if (num2 >= num1 && num2 >= num3) {
                System.out.print(num2 + " ");
                if (num1 > num3) System.out.print(num1 + " "+ num3);
                else System.out.print(num3 + " "+ num1);
            }
            else
                if (num3 >= num1 && num3 >= num2) {
                    System.out.print(num3 + " ");
                    if (num1 > num2) System.out.print(num1 + " "+ num2);
                    else System.out.print(num2 + " "+ num1);
                }
//                else {}

    }
}
