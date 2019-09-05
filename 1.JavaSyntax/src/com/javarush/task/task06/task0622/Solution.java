package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList();
        for (int i = 0; i < 5; i++){
            nums.add(Integer.parseInt(reader.readLine()));

        }
//        System.out.println(nums.get(1)>0);

        //сортировка
        int buf;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++){
                if (nums.get(i) > nums.get(i + 1)) {
                    buf = nums.get(i);
                    nums.set(i, nums.get(i + 1));
                    nums.set(i+1, buf);
                }
            }
        }

        for (int i = 0; i < 5; i++){
            System.out.println(nums.get(i));
        }
//
    }
}
