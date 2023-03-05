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

        list.add(5, "NEW5");
        System.out.println("list = " + list);


    }
}
