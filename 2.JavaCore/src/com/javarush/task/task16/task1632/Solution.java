package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) throws InterruptedException{
//        threads.add(new MyThread0());
//        threads.get(0).start();
//        threads.add(new MyThread1());
//        threads.get(1).start();
//        threads.add(new MyThread2());
//        threads.get(1).start();
//        MyThread3 thread = new MyThread3();
//        thread.start();
//        try {
//            sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread.interrupt();
//        System.out.println("after interrupt");

        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt();
    }

    public static class MyThread0 extends Thread {
        public MyThread0() {
            super("MyThread0");
        }

        public void run(){
            while (!Thread.currentThread().isInterrupted()) {
            }
        }
    }

    public static class MyThread1 extends Thread {
        public MyThread1() {
            super("MyThread1");
        }

        public void run(){
            try {
                sleep(1000);
                System.out.println("run");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread2 extends Thread {
        public MyThread2() {
            super("MyThread2");
        }

        public void run(){
            while (!isInterrupted()) {
                try {
                    sleep(500);
                    System.out.println("Ура");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class MyThread3 extends Thread implements Message {
        public MyThread3() {
            super("MyThread3");
        }

        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
//                try {
                    sleep(500);
                    System.out.println("Урhhhа");
//                } catch (InterruptedException e) {
//                }
            }
        }

        @Override
        public void showWarning() {
//            Thread.currentThread().isInterrupted() = true;
        }
    }


    class Clock implements Runnable
    {
        public void run()
        {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted())
            {
                Thread.sleep(1000);
                System.out.println("Tik");
            }
        }
    }

}