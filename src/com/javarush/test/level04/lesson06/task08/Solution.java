package com.javarush.test.level04.lesson06.task08;

/* Координатные четверти
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a > b) && (a > c))
        {
            if (b > c) System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        }

        if ((b > a) && (b > c))
        {
            if (a > c) System.out.println(b + " " + a + " " + c);
            else System.out.println(b + " " + c + " " + a);
        }

        if ((c > a) && (c > b))
        {
            if (a > b) System.out.println(c + " " + a + " " + b);
            else System.out.println(c + " " + b + " " + a);
        }
    }
}