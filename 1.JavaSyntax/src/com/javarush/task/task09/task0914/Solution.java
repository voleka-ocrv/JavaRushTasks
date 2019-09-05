package com.javarush.task.task09.task0914;

/* 
Группа перехвата исключений
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        }
        catch (Exception3 exception3) {
            exception3.printStackTrace();
            System.out.println(exception3);
        }
        catch (Exception2 exception2) {
            exception2.printStackTrace();
            System.out.println(exception2);
        }
        catch (Exception1 exception1) {
            exception1.printStackTrace();
            System.out.println(exception1);
        }
        catch (Exception exception1) {
            exception1.printStackTrace();
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
//        int i = 2;
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
