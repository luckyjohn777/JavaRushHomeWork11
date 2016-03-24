package com.javarush.test.level20.lesson07.task01;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* Externalizable для апартаментов
Реализуйте интерфейс Externalizable для класса Apartment
Подумайте, какие поля не нужно сериализовать.
*/
public class Solution
{
    /*public static void main(String[] args) throws IOException, ClassNotFoundException
    {   *//*FileOutputStream fos = new FileOutputStream("C:\\Users\\Russidze\\Desktop\\salva.txt");
        ObjectOutputStream oo = new ObjectOutputStream(fos);
        Apartment ap1 = new Apartment("koneva 23", 1984);
        ap1.writeExternal(oo);
        System.out.println(ap1.toString());
        oo.close(); fos.close();*//*
        FileInputStream fis = new FileInputStream("C:\\Users\\Russidze\\Desktop\\salva.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Apartment ap2 = new Apartment();
        ap2.readExternal(ois);
        System.out.println(ap2.toString());
        ois.close();fis.close();
    }*/

    public static class Apartment implements Externalizable
    {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment()
        {
            super();
        }

        public Apartment(String adr, int y)
        {
            address = adr;
            year = y;
        }

        /**
         * Prints out the fields. used for testing!
         */
        public String toString()
        {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException
        {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
        {
            address = (String) in.readObject();
            year = in.readInt();

        }
    }
}