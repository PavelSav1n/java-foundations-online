package ru.itsjava.collections.lists.arrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());

        System.out.println("list.isEmpty() = " + list.isEmpty());
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());
        System.out.println();
        System.out.println("list.contains(\"Privet\") = " + list.contains("Privet"));
        System.out.println("list.contains(\"Privet2\") = " + list.contains("Privet2"));

        list.clear();
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());

        list.add("Privet");
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());
        System.out.println("list.contains(\"Privet\") = " + list.contains("Privet"));
        System.out.println("list.contains(\"Privet2\") = " + list.contains("Privet2"));
    }
}
