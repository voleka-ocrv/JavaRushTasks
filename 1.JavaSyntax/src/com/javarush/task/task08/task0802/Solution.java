package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> HashMap = new HashMap<String, String>();
        HashMap.put("арбуз", "ягода");
        HashMap.put("банан", "трава");
        HashMap.put("вишня", "ягода");
        HashMap.put("груша", "фрукт");
        HashMap.put("дыня", "овощ");
        HashMap.put("ежевика", "куст");
        HashMap.put("жень-шень", "корень");
        HashMap.put("земляника", "ягода");
        HashMap.put("ирис", "цветок");
        HashMap.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : HashMap.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }

    }
}
