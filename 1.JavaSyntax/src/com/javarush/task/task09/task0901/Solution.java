package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
//        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }
}
