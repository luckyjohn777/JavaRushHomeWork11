package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(reader.readLine());
        String s;
        String d;
        int m;
        {
            if (a % 2 == 0)
                m = 1;
            else
                m = 2;
        }
        if (a < 0 && m == 1)
            System.out.print("отрицательное четное число");
        else if (a < 0 && m == 2)
            System.out.print("отрицательное нечетное число");
        else if (a == 0)
            System.out.print("нулевое число");
        else if (a > 0 && m == 1)
            System.out.print("положительное четное число");
        else if (a > 0 && m == 2)
            System.out.print("положительное нечетное число");
    }
}