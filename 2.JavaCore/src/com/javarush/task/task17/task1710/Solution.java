package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) throws ParseException {
        if (args.length != 0) {
            //проверка достаточности аргументов
            switch (args[0]){
                case "-c":{
                    Person.createPerson(allPeople, args);
                    break;
                }
                case "-u":{
                    Person.updatePerson(allPeople, args);
                    break;
                }
                case "-d":{
                    Person.deletePerson(allPeople, args);
                    break;
                }
                case "-i":{
                    Person.infoPerson(allPeople, args);
                    break;
                }
                default:{
                    System.out.println("Unknown parameter");
                    break;
                }
            };

        }
        else {
            System.out.println("Program was started without parameter");
        }
    }
}
