package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(createArray(5));
        arrayList.add(createArray(2));
        arrayList.add(createArray(4));
        arrayList.add(createArray(7));
        arrayList.add(createArray(0));
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }

    public static int[] createArray(int dimension) {
        int[] newArray = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

}
