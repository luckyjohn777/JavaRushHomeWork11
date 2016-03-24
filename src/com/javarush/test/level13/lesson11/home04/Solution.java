package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader chlen = new BufferedReader(new InputStreamReader(System.in));
        FileReader chlen2 = new FileReader(chlen.readLine());
        BufferedReader chlen3 = new BufferedReader(chlen2);

        if (chlen.equals("exit")) ;
        System.out.println(chlen);
    }
}
