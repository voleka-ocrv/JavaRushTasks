package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l =  1234_564_890L;                        //(byte)
        int x =  0b1000_1100_1010;                      //(byte)
        double m = (byte) 110_987_654_6299.123_34;
        float f =  l++ + 10 + ++x - (float) m;          //(byte)
        l = (long) f / 1000;
        System.out.println(l);
        String s = new String();
//        s.equals()
    }
}
//2 147 483 647