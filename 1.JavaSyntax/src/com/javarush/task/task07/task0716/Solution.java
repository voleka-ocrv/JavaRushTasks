package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
//        list.add("роза"); // 0
//        list.add("лира"); // 2
//        list.add("лоза"); // 1


        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
//        indexOf()

        for (int i =0; i < list.size(); i++) {
            if (list.get(i).indexOf("р") >= 0 && list.get(i).indexOf("л") >= 0) { //содержит и Р, и Л
                //вывести слово без изменений

            }
            else {
                //проверить по отдельности наличие буквы Л и буквы Р
                if (list.get(i).indexOf("р") >= 0){
                    //если есть только Р, то удалить
                    list.remove(i);
                    i--; //возвращается
                }
                else { //если Р нет, проверить на наличие буквы Л
                    if (list.get(i).indexOf("л") >= 0){
                        //если есть только буква Л, то удваивать
                        list.add(i, list.get(i));
                        i++; //перескакивает через добавленное слово
                    }
                    else { //если нет Р и Л ни вместе, ни по отдельности, то оставить как есть

                    }
                }

            }
        }

        return list;
    }
}