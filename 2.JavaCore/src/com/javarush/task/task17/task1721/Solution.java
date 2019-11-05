package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        //FileNotFoundException
        String fileNameAllLines, fileNameForRemoveLines;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileNameAllLines = readFileName(reader);
            fileNameForRemoveLines = readFileName(reader);
            reader.close();

//        fileNameAllLines = "D:\\JavaRushProject\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task17\\task1721\\allLines.txt";
//        fileNameForRemoveLines = "D:\\JavaRushProject\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task17\\task1721\\forRemoveLines.txt";
            try {
                allLines = readFileContent(fileNameAllLines);
                forRemoveLines = readFileContent(fileNameForRemoveLines);
//            System.out.println(allLines);
//            System.out.println(forRemoveLines);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try {
                Solution solution = new Solution();
                solution.joinData();
//                joinData();
            } catch (CorruptedDataException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
//        main();
        if (!forRemoveLines.retainAll(allLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
//        System.out.println(allLines);
//        System.out.println(forRemoveLines);
    }

    public static String readFileName(BufferedReader reader) throws IOException {
        String fileName;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        return fileName;
    }

    public static List<String> readFileContent(String fileName) throws FileNotFoundException {
        List<String> list = new ArrayList<String>();

        if (!fileName.isEmpty()) {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNextLine())
                list.add(in.nextLine());
            in.close();
        }
        return list;
    }

    public static boolean compareLists(List<String> includedLines, List<String> containedLines) {
        boolean isIncluded = true;
        for (String includedLine : includedLines) {
            for (String containedLine : containedLines) {
                if (includedLine.compareTo(containedLine) == 0) {
                    isIncluded = true;//?
                    break;
                } else isIncluded = false;
            }
            if (!isIncluded) {
                break;
            }
        }
        return isIncluded;
    }

    public static void removeLines(List<String> includedLines, List<String> containedLines) {
        Iterator itr = allLines.iterator();
        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            if (x < 10)
                itr.remove();
        }
    }
}
/*Если allLines содержит все строки из forRemoveLines =
удалить из allLines все строки, которые есть в forRemoveLines
 иначе
 1. Очистить allLines
 2. Выбросить исключение*/
