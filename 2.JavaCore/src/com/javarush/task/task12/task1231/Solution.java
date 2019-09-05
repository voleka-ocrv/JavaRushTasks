package com.javarush.task.task12.task1231;

/* 
Ненужные абстракции
*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public void fly();                                         //-abstract
    }

    public static class Horse {                                     //-abstract
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {                                         //-abstract

        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {  //+
        public abstract void swim();                                //+abstract
    }

}
