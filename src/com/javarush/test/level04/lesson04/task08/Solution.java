package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b2 = reader.readLine();
        String c3 = reader.readLine();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        Integer a = Integer.parseInt(a1);
        Integer b = Integer.parseInt(b2);
        Integer c = Integer.parseInt(c3);
        if (a < c + b && b < a + c && c < a + b)
        {
            System.out.println("Треугольник существует.");
        } else
        {
            System.out.println("Треугольник не существует.");
        }


    }
}