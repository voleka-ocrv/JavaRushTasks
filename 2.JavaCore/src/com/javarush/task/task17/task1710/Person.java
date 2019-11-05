package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    private Person(String name, String sex, String birthDay) {
        this.name = name;

        //обработать дату
        Date birthDate;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            this.birthDate = formatter.parse(birthDay);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Дата должна указываться в формате 'dd/MM/yyyy'. Запись не создана.");
        }

        this.sex = derermineSex(sex);
    }


    public static void createPerson(List<Person> allPeople, String[] args) throws ParseException {
        int parameterQuantity = 3;

        if (args.length < parameterQuantity++) {
            System.out.println("Формат команды: -c name sex bd\n");
        } else {
            allPeople.add(new Person(args[1], args[2], args[3]));
            System.out.println(allPeople.size() - 1);
        }
    }

    public static void updatePerson(List<Person> allPeople, String[] args) throws ParseException {
        int parameterQuantity = 4;

        if (args.length < parameterQuantity++) {
            System.out.println("-u id name sex bd\n");
        } else {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            {
                person.setName(args[2]);
                person.setSex(derermineSex(args[3]));
                person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
            }
        }
    }

    public static void deletePerson(List<Person> allPeople, String[] args) throws ParseException {
        int parameterQuantity = 1;
        if (args.length < parameterQuantity++) {
            System.out.println("-d id\n");
        } else {
            int idArg = Integer.parseInt(args[1]);
//            allPeople.remove(idArg);
            Person person = allPeople.get(idArg);
            {
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }
            System.out.println(idArg);
        }
    }

    public static void infoPerson(List<Person> allPeople, String[] args) throws ParseException {
        int parameterQuantity = 1;

        if (args.length < parameterQuantity++) {
            System.out.println("-i id\n");
        } else {
            int idArg = Integer.parseInt(args[1]);
            Person person = allPeople.get(idArg);
            Date date = person.getBirthDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String sexArg = "м";
//            Sex sex = ;
            if (person.getSex() == Sex.MALE) sexArg = "м";
            if (person.getSex() == Sex.FEMALE) sexArg = "ж";

//            switch (person.getSex()) {
//                case Sex.MALE: {
//                    sexArg = "м";
//                    break;
//                }
//                case Sex.FEMALE: {
//                    sexArg = "ж";
//                    break;
//                }
//            }
            System.out.println(person.getName() + " " + sexArg + " " + simpleDateFormat.format(date));
//            System.out.println(simpleDateFormat.format(date));
        }
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static Sex derermineSex(String sex) {
        switch (sex) {
            case "м": {
                return Sex.MALE;
            }
            case "ж": {
                return Sex.FEMALE;
            }
            default: {
                throw new IllegalArgumentException("Параметр 'Пол' может принимать значение 'м' или 'ж'. Запись не создана.");
            }
        }
    }
}
