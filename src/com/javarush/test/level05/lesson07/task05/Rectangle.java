package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0а я по каким условиям делал бля ТЬ?ГДЕ У ТЕБЯ НАПИСАНО ЧТО ВЫСОТА И ШИРИНА = 0?
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top)
    {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top)
    {
        this.top = top;
    }


    public void initialize(int left, int top, int width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void copy(Rectangle copy)
    {
        this.top = copy.getTop();
        this.left = copy.getLeft();
        this.width = copy.getWidth();
        this.height = copy.getHeight();
    }

    public int getTop()
    {
        return top;
    }

    public int getLeft()
    {
        return left;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }
}
