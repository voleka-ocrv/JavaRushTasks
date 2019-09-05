package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
        print((Integer) 2);
    }
    public static void print(int pInt){
        System.out.print(pInt);
    }
    public static void print(Integer pInteger){
        System.out.print(pInteger);
    }
}
