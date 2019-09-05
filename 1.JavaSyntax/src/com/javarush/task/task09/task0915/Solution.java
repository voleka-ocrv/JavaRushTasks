package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();                     //обработка выброшенного исключения
        } catch (FileSystemException e) {
            StatelessBean exception = new StatelessBean();
            exception.log(e);
        }
    }

    public static void handleExceptions() throws FileSystemException {
        try {
            BEAN.methodThrowExceptions();           //пробрасывает исключения рандомные
        }
        catch (FileSystemException e) {
            StatelessBean exception = new StatelessBean();
            exception.log(e);
            throw e;
        }
        catch (CharConversionException e) {
            StatelessBean exception = new StatelessBean();
            exception.log(e);
        }
        catch (IOException e) {
//            e.printStackTrace();
            StatelessBean exception = new StatelessBean();
            exception.log(e);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
//            int i = (int) (Math.random() * 3);
            int i = 1;
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
