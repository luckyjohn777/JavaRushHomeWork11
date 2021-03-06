package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int maximum = 0;
        int minimum = 0;

        int[] arr = new int[20];  //Напишите тут ваш код


        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());

        }
        maximum = arr[0];
        minimum = arr[0];

        for (int i = 1; i < arr.length; i++)
        {

            if (arr[i] < minimum)
            {
                minimum = arr[i];
            }

        }

        for (int i = 1; i < arr.length; i++)
        {

            if (arr[i] > maximum)
            {
                maximum = arr[i];
            }

        }
        System.out.print(maximum);
        System.out.print(" ");
        System.out.print(minimum);
    }
}