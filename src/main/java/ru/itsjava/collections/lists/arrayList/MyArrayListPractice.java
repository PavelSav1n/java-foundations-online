package ru.itsjava.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Пустой список:
        System.out.println(list.size());
        list.add("Privet0");
        list.add("Privet1");
        list.add("Privet2");
        list.add("Privet3");
        list.add("Privet4");
        list.add("Privet4");
        list.add("Privet4");
        list.add("Privet5");
        list.add("Privet6");
        list.get(0);

        // Первый элемент
        list.add(0, "test");
        System.out.println("list = " + list);
        // Середина
        list.add(5, "test");
        System.out.println("list = " + list);
        // Последний элемент
        list.add(list.size()-1, "test");
        System.out.println("list = " + list);

        System.out.println("list.indexOf(\"Privet0\") = " + list.indexOf("test"));

        System.out.println("list.lastIndexOf(\"test\") = " + list.lastIndexOf("test"));
        System.out.println("list.lastIndexOf(\"Privet4\") = " + list.lastIndexOf("Privet4"));
        System.out.println("list.lastIndexOf(\"Privet43\") = " + list.lastIndexOf("Privet43"));


    }
}
