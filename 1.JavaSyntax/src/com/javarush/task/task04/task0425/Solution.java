package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int oX = Integer.parseInt (reader.readLine());
        int oY = Integer.parseInt (reader.readLine());
        if (oX > 0) {
            if (oY > 0) System.out.println(1);
            else System.out.println(4);}
        else {
            if (oY > 0) System.out.println(2);
            else System.out.println(3);}

    }
}
