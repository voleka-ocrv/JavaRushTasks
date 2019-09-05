package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        /*

        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int currentSequence = 0;
        int maximumSequence = 0;

        for (int i = 0; i < 10; i++){
           arrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < arrayList.size(); i++){
            currentSequence = compareNumbers(arrayList, i);
            if (maximumSequence < currentSequence) maximumSequence = currentSequence;
//            System.out.println(i + " " + compareNumbers(arrayList, i));
        }
        System.out.println(maximumSequence);
    }

    public static int compareNumbers (ArrayList<Integer> arrayList, int indexFirst){
        int indexNext = indexFirst;
        int coutnter = 0;
        while (
                (indexNext != arrayList.size() &&
                        (arrayList.get(indexFirst).equals(arrayList.get(indexNext))))) {
            coutnter++;
            indexNext++;
        }
        return coutnter;
        }
}