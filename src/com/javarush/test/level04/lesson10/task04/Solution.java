package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "S";
        int a = 10;
        int i = 1;
        while (i <= a)
        {
            System.out.println(s + s + s + s + s + s + s + s + s + s);
            i++;
        }


    }
}
