package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        Integer c = Integer.parseInt(reader.readLine());
        if (a >= b && a <= c || a <= b && a >= c)
        {
            System.out.println(a);
        }
        if (b >= a && b <= c || b <= a && b >= c)
        {
            System.out.println(b);
        }
        if (c >= a && c <= b || c <= a && c >= b)
        {
            System.out.println(c);
        }
    }
}
