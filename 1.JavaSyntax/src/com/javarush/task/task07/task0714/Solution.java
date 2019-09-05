package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) array.add(reader.readLine());
        array.remove(2);
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(array.size() - (i + 1)));        //0..20 0=19 1=18 2=17 19=0 20-i-1
        }
    }
}


