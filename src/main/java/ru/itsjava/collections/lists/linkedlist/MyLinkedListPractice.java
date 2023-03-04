package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("row0");
        list.add("row1");
        list.add("row2");
        list.add("row3");
        list.add("row4");
        list.add("row5");
        // метод Object get(int index)
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list = " + list);
        // метод Object set(int index, Object element)
        System.out.println("list.set(2,\"TEST\") = " + list.set(5, "TEST"));
        System.out.println("list = " + list);
        // очистка списка
//        list.clear();
//        System.out.println("list = " + list);
    }
}
