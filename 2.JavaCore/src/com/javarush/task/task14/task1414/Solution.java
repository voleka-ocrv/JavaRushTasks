package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        List<String> list = Arrays.asList("cartoon", "thriller", "soapOpera");

        do {
            key = bufferedReader.readLine();
            Object movie = new Object();
            MovieFactory.getMovie(key);
            if (list.contains(key)) {
                switch (key) {
                    case ("cartoon"):
                        movie = new Cartoon();
                        break;
                    case ("thriller"):
                        movie = new Thriller();
                        break;
                    case ("soapOpera"):
                        movie = new SoapOpera();
                        break;
                }
                System.out.println(movie.getClass().getSimpleName());
            }
            else break;
        } while (list.contains(key));

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

           if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

           if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }
    static class SoapOpera extends Movie {
    }
    static class Cartoon extends Movie {

    }
    static class Thriller extends Movie {

    }
}
