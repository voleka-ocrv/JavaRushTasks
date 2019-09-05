package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution<thows> {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
//            exception.printStackTrace();
            e.printStackTrace();

        }
    }
    public static void divideByZero () throws ArithmeticException{
        System.out.println("Divide by zero. ArithmeticError");
        int i = 1/0;
    }
}
