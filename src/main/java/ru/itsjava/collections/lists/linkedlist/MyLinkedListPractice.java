package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("row1");
        list.add("row2");
        list.add("row3");
        list.add("row4");
        list.add("row5");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.contains(\"row1\") = " + list.contains("row1"));
        System.out.println("list.contains(\"row3\") = " + list.contains("row3"));
        System.out.println("list.contains(\"row5\") = " + list.contains("row5"));
        System.out.println("list.contains(\"row52\") = " + list.contains("row52"));
    }
}
