package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public Solution() {
    }

    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String filePath = reader.readLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("C:\\Users\\ekaterina.volkova\\Desktop\\TBD\\text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        /*
        String name;
        String line;
        System.out.println("Print File "+f.getName()+"? y/n");
        name = br.readLine();
        if(name.equals("y"))
        while ((line = fin.readLine()) != null) System.out.println(line);
         */
//        InputStream inStream = new FileInputStream(filePath);
//        InputStream inStream = new FileInputStream("C:\\Users\\ekaterina.volkova\\Desktop\\TBD\\text.txt");
//        OutputStream outStream = new FileOutputStream("c:/result.txt");

//        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ekaterina.volkova\\Desktop\\TBD\\text.txt"));
//        String contents = reader.readLine();
//        while (inStream.available() > 0)
//        {
//            int data = inStream.read(); //читаем один байт из потока для чтения
//            int data = inStream.read(); //читаем один байт из потока для чтения
//            System.out.print(data);

//            outStream.write(data); //записываем прочитанный байт в другой поток.
//        }

//        inStream.close(); //закрываем потоки
//        outStream.close();
    }

}