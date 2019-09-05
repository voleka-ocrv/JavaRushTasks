package com.javarush.task.task10.task1005;

/* 
Задача №5 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = 300;         //300 - 127 = 173. -127 + 173 = 46
        short c = (short) (b - a);   //256 + 44 = 300
        System.out.println(c);
    }
}