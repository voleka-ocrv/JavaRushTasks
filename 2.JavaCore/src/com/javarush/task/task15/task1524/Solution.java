package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    public static int i;
    public static String name;
//    public int i = 6;
//    public String name = "First name";
//    static {
//        System.out.println("Static block");
//        System.out.println("public static void main");
//    }
    {
        printAllFields(this);
        i = 6;
        name = "First name";
    }
//    {
//        System.out.println("Non-static block"); // 4/
//        printAllFields(this); // 4 -> 5
//    }
    static {
        init();
        System.out.println("public static void main"); // 3.
        System.out.println("Non-static block"); // 4/
        printAllFields(this);
    }
    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()"); // 1.
        System.out.println("Static block"); // 2.
    }

    public static void main(String[] args) {
//        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields"); //
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
