package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("row1");
        list.add("row2");
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list = " + list);
    }
}
