package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int i;
            while (true){
                i = Integer.parseInt(reader.readLine());
                if (i != 999){
                    arrayList.add(i);
                }
                else
                    break;
            }
        }
        catch (NumberFormatException e) {
            for (Integer element : arrayList) {
                System.out.println(element);
            }
        }
        catch (IOException e) {
            for (Integer element : arrayList) {
                System.out.println("IOException");
            }
        }
    }
}
