package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //сортировка массива по убыванию
        boolean swap = false;
        int buffer;
        for (int i = 0; i < array.length - 1; i++){
            while (!swap){                                //пока какие-то части массива меняются - проводить перестановки swap, true = в массиве есть объекты, которые надо менять
                for (int j = 0; j < array.length - 1; j++){
                    if (array[j] < array[j + 1]){
                        buffer = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = buffer;
                        swap = false;
                    }
                    else swap = true;
                }
            }
        }
    }
}
