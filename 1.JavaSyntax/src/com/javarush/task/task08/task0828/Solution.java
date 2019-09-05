package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthName = reader.readLine();
        List<String> monthList = Arrays.asList("January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December");
        if (monthList.indexOf(monthName) != -1) {System.out.println(monthName + " is the " + (monthList.indexOf(monthName) + 1) + " month"); }
    }
}

