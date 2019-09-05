package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method2();
    }

    public static StackTraceElement[] method2() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method3();
    }

    public static StackTraceElement[] method3() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method4();
    }

    public static StackTraceElement[] method4() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method5();
    }

    public static StackTraceElement[] method5() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method6();
    }

    public static StackTraceElement[] method6() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method7();
    }

    public static StackTraceElement[] method7() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method8();
    }

    public static StackTraceElement[] method8() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method9();
    }

    public static StackTraceElement[] method9() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return method10();
    }

    public static StackTraceElement[] method10() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println("***");
        return Thread.currentThread().getStackTrace();
    }
}
