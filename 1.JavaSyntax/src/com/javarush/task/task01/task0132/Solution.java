package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number)  {
        int houndred = number/100;                                  //сотни
        int decimal = (number - houndred * 100) / 10;              //десятки
        int single = (number - houndred * 100 - decimal * 10);     //единицы
        int sum = houndred;
        return sum + decimal + single;
    }
}