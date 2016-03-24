package com.javarush.test.level15.lesson02.task01;

/* ООП - Расставить интерфейсы
1. Добавить все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
2. Реализовать их методы.
*/

public class Solution
{
    public interface Movable
    {
        boolean getAllowedAction(String name);
    }

    public interface Sellable
    {
        Object getAllowedAction(String name);
    }

    public interface Discountable
    {
        Object getAllowedAction();
    }

    public static class Clothes implements Discountable, Sellable
    {
        @Override
        public Object getAllowedAction()
        {
            return null;
        }

        @Override
        public Object getAllowedAction(String name)
        {
            return null;
        }
    }
}
