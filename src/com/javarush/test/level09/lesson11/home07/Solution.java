package com.javarush.test.level09.lesson11.home07;

/* Расставь модификаторы static
Расставь модификаторы static так, чтобы пример скомпилировался.
*/

public class Solution
{
    public static int A = 5;
    public static int B = 2 * A;
    public static int D = A * B;
    public int C = A * B;

    public void main(String[] args)
    {
        Solution room = new Solution();
        A = 5;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }

}