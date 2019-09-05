package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human maxim = new Human("Maxim", false, 21);
        Human fuslan = new Human("Ruslan", false, 22);
        Human piter = new Human("Piter", false, 23);
        Human olga = new Human("Olga", true, 24);

        Human katya = new Human("Katya", true, 20, maxim, olga);
        Human nastya = new Human("Nastya", true, 30, maxim, olga);
        Human zoya = new Human("Zoya", true, 40, maxim, olga);
        Human tolya = new Human("Tolya", false, 50, maxim, olga);
        Human kolya = new Human("Kolya", false, 60, maxim, olga);

        System.out.println(maxim.toString());
        System.out.println(fuslan.toString());
        System.out.println(piter.toString());
        System.out.println(olga.toString());
        System.out.println(katya.toString());
        System.out.println(nastya.toString());
        System.out.println(zoya.toString());
        System.out.println(tolya.toString());
        System.out.println(kolya.toString());
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}