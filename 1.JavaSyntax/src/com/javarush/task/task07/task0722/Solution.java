package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        int i = 0;
        String s;
        while (true){
            s = reader.readLine();
            if (!s.equals("end"))
                array.add(s);
            else break;
        }

        for (i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}