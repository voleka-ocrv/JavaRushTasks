package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> array = new ArrayList<String>();
        int[] array = new int[10];                                  //{167, -2, 16, 99, 26, 92, 43, -234, 35, 80}
        for (int i = 0; i < 10; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

//        int i = 0;
//        while (i < array.size() - 1){
//            if (array.get(i).length() > array.get(i + 1).length()) {
//                System.out.println(i + 1);
//                break;
//            }
//            i++;
//        }

        Arrays.sort(array);
        for (int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }

    }
}

