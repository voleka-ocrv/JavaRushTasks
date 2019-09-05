package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
//        double result;
        if (b != 0) return (double) a / b;
        else {
            System.out.println("division by zero");
            return 0;}
//        return 0;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (double) a * b / 100;
    }

    public static void main(String[] args) {
//        System.out.println(percent(110000, 0));

    }
}