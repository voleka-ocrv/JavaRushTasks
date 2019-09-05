package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
//        System.out.println(abs(-10));
        return Math.sqrt(abs(x1 - x2)*abs(x1 - x2) + abs(y1 - y2)*abs(y1 - y2));
//        return ;
    }

    public static int abs (int a){
            return (a > 0) ? a : -a;
    }

    public static void main(String[] args) {
//        System.out.println(getDistance(0,0,1,1));
    }
}
