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

    public static void createPerson(List<Person> allPeople, String[] args) throws ParseException {
        int parameterQuantity = 3;

        if (args.length < parameterQuantity++) {
            System.out.println("Формат команды: -c name sex bd\n");
        } else {
            String nameArg = args[1];
            String sexArg = args[2];
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date birthDateArg = formatter.parse(args[3]);
            Person person = null;
            switch (sexArg) {
                case "м": {
                    person = createMale(nameArg, birthDateArg);
                    break;
                }
                case "ж": {
                    person = createFemale(nameArg, birthDateArg);
                    break;
                }
                default: {
                    System.out.println("Параметр 'Пол' может принимать значение 'м' или 'ж'. Запись не создана.");
                    break;
                }
            }
            if (!person.equals(null)) {
                allPeople.add(person);
                System.out.println(allPeople.size()-1);
            }
        }
    }

    public static void updatePerson(List<Person> allPeople, String[] args) throws ParseException {
        int parameterQuantity = 4;

        if (args.length < parameterQuantity++) {
            System.out.println("-u id name sex bd\n");
        } else {
            Integer idArg = Integer.parseInt(args[1]);
            String nameArg = args[2];
            String sexArg = args[3];
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date birthDateArg = formatter.parse(args[4]);
            Sex sex = Sex.MALE;
            switch (sexArg) {
                case "м": {
                    sex = Sex.MALE;
                    break;
                }
                case "ж": {
                    sex = Sex.FEMALE;
                    break;
                }
                default: {
                    System.out.println("Параметр 'Пол' может принимать значение 'м' или 'ж'.");
                    break;
                }
            }

            Person person = allPeople.get(idArg);
            {
                person.setName(nameArg);
                person.setSex(sex);
                person.setBirthDate(birthDateArg);
            }
            System.out.println(idArg);
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

    public void birthDateToStrig() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM", Locale.ENGLISH);
//        System.out.println("Constructor 4: " + dateFormat.format(birthDate) );
        System.out.println(new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(birthDate));
    }
}
