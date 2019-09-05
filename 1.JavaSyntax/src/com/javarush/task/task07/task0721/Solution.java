package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        //поиск макс/мин значения
        boolean swap;
        int buffer;
        for (int i = 0; i < array.length - 1; i++){
            swap = false;
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j + 1]){
                    //меняются местами
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    swap = true;
                }
            }
        }
        minimum = array[0];
        maximum = array[array.length - 1];
        System.out.print(maximum + " " + minimum);
    }
}
/*
    for (let i = 0, endI = arr.length - 1; i < endI; i++) {
        let wasSwap = false;
        for (let j = 0, endJ = endI - i; j < endJ; j++) {
            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                wasSwap = true;
            }
        }
        if (!wasSwap) break;
    }
 */