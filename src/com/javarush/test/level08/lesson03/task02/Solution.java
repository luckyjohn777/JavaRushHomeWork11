package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Map<String, String> maping = new HashMap<>();
        maping.put("арбуз", "ягода");
        maping.put("банан", "трава");
        maping.put("вишня", "ягода");
        maping.put("груша", "фрукт");
        maping.put("дыня", "овощ");
        maping.put("ежевика", "куст");
        maping.put("жень-шень", "корень");
        maping.put("земляника", "ягода");
        maping.put("ирис", "цветок");
        maping.put("картофель", "клубень");
        for (Map.Entry<String, String> pair : maping.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
