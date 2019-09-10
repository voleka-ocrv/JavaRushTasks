package com.javarush.task.task14.task1413;

/* 
Computer
*/

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

//    interface CompItem {
//        String getName();
//    }

//    static class Keyboard implements CompItem {
//        public String getName() {
//            return "Keyboard";
//        }
//    }

//    static class Mouse implements CompItem {
//        public String getName() {
//            return "Mouse";
//        }
//    }

//    static class Monitor implements CompItem {
//        public String getName() {
//            return "Monitor";
//        }
//    }

//    static class Computer {
//        private Keyboard keyboard = new Keyboard();
//        private Mouse mouse = new Mouse();
//        private Monitor monitor = new Monitor();
//
//        public Computer (Keyboard keyboard, Mouse mouse, Monitor monitor) {
//            this.keyboard = keyboard;
//            this.mouse = mouse;
//            this.monitor = monitor;
//        }
//
//        public Keyboard getKeyboard() {
//            return keyboard;
//        }
//
//        public Mouse getMouse() {
//            return mouse;
//        }
//
//        public Monitor getMonitor() {
//            return monitor;
//        }
//    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}
