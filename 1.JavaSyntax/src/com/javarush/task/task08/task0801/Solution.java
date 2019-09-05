package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> HashSet = new  HashSet<String>();

        HashSet.add("арбуз");
        HashSet.add("банан");
        HashSet.add("вишня");
        HashSet.add("груша");
        HashSet.add("дыня");
        HashSet.add("ежевика");
        HashSet.add("женьшень");
        HashSet.add("земляника");
        HashSet.add("ирис");
        HashSet.add("картофель");

        for (String text: HashSet){
            System.out.println(text);
        }
    }
}
