package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        Integer c = Integer.parseInt(reader.readLine());

        if (a > 0 && b > 0 && c > 0)
        {
            System.out.println("3");
        }
        if (a > 0 && b > 0 && c < 0)
        {
            System.out.println("2");
        }
        if (a > 0 && b < 0 && c < 0)
        {
            System.out.println("2");
        }
        if (a < 0 && b < 0 && c > 0)
        {
            System.out.println("1");
        }
        if (a < 0 && b < 0 && c < 0)
        {
            System.out.println("0");
        }
        if (a < 0 && b > 0 && c > 0)
        {
            System.out.println("2");
        }
        if (a > 0 && b < 0 && c > 0)
        {
            System.out.println("2");
        }

    }
}
