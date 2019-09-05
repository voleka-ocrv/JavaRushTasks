package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        ArrayList<Integer> div3Array = new ArrayList<Integer>();
        ArrayList<Integer> div2Array = new ArrayList<Integer>();
        ArrayList<Integer> divAllArray = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) numArray.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < numArray.size(); i++) {
            if (numArray.get(i) % 3 == 0) div3Array.add(numArray.get(i));
        }
        for (int i = 0; i < numArray.size(); i++) {
            if (numArray.get(i) % 2 == 0) div2Array.add(numArray.get(i));
        }
        for (int i = 0; i < numArray.size(); i++) {
            if (numArray.get(i) % 2 != 0 && numArray.get(i) % 3 != 0) divAllArray.add(numArray.get(i));
        }

//        for (int i = 0; i < numArray.size(); i++) {
//            if (numArray.get(i) % 2 == 0 || numArray.get(i) % 3 == 0)
//            {
//                if (numArray.get(i) % 3 == 0) div3Array.add(numArray.get(i));
//                if (numArray.get(i) % 2 == 0) div2Array.add(numArray.get(i));
//            }
//            else
//                divAllArray.add(numArray.get(i));
//        }
        printList(div3Array);
        printList(div2Array);
        printList(divAllArray);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
