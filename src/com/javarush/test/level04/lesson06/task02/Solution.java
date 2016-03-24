package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        Integer d = Integer.parseInt(reader.readLine());
        if (a > b && a > c && a > d)
        {
            System.out.println(a);
        }
        if (b > a && b > c && b > d)
        {
            System.out.println(b);
        }
        if (c > a && c > b && c > d)
        {
            System.out.println(c);

        }
        if (d > a && d > c && d > b)
        {
            System.out.println(d);
        }

    }
}
