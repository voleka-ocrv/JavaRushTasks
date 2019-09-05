package com.javarush.task.task08.task0830_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class SolutionAlternative {
    public static void main(String[] args) throws IOException {
        String firstString = "C:\\Users\\ekaterina.volkova\\Desktop\\TBD\\text.txt";
        printFirstString(firstString);
//        System.out.println(firstString);
    }
    public static void printFirstString(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String firstString = reader.readLine();
        System.out.println(firstString);
    }
}

