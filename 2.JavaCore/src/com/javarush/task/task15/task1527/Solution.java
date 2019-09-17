package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        String url, value;
        String[] parameters;
//        System.out.println("Please, enter URL");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            url = bufferedReader.readLine();
            parameters = url.replaceAll("^(.*\\?)","").split("\\&");
            for (String parameter : parameters){
                System.out.print(parameter.replaceAll("=.*", "") + " ");
            }
            System.out.println();
            for (String parameter : parameters){
                value = parameter.replaceAll(".*=", "");
                if (parameter.replaceAll("=.*", "").equals("obj")){

                    try {
                        alert(Double.parseDouble(value));
                    } catch (NumberFormatException e) {
                        alert(value);
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
