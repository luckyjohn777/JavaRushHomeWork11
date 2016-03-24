package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man manFirst = new Man("LexaPizdabol", 23, "Russia");
        Man manSecond = new Man("ArturObida", 27, "Dagestan");
        Woman womanFirst = new Woman("LarisaKidalo", 23, "Russia");
        Woman womanSecond = new Woman("IraObida", 25, "Russia");
        System.out.println(manFirst.name + " " + manFirst.age + " " + manFirst.address);
        System.out.println(manSecond.name + " " + manSecond.age + " " + manSecond.address);
        System.out.println(womanFirst.name + " " + womanFirst.age + " " + womanFirst.address);
        System.out.println(womanSecond.name + " " + womanSecond.age + " " + womanSecond.address);
    }

    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(String name)
        {
            this.name = name;
        }

        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, String address)
        {
            this.name = name;
            this.address = address;
        }

        public Man(int age, String address)
        {
            this.age = age;
            this.address = address;
        }

        public Man(int age)
        {
            this.age = age;
        }

    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name)
        {
            this.name = name;
        }

        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, String address)
        {
            this.name = name;
            this.address = address;
        }

        public Woman(int age, String address)
        {
            this.age = age;
            this.address = address;
        }

        public Woman(int age)
        {
            this.age = age;
        }
    }
}
