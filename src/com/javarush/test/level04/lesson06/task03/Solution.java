package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        if (a > b && a > c && b > c)
        {
            System.out.print(a + " " + b + " " + c);
        }
        if (b > a && b > c && a > c)
        {
            System.out.print(b + " " + a + " " + c);
        }
        if (c > a && c > b && b > a)
        {
            System.out.print(c + " " + b + " " + a);
        }
        if (c > a && c > b && a > b)
        {
            System.out.print(c + " " + a + " " + b);
        }
        if (a > b && c > b && a > c)
        {
            System.out.print(a + " " + c + " " + b);
        }
        if (b > a && b > c && c > a)
        {
            System.out.print(b + " " + c + " " + a);
        }


    }
}
