package ru.itsjava.experiments.experimentheapstack;

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        System.out.println("Person construct");
        this.id = id;
        this.name = name;
    }
}