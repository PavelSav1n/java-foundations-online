package ru.itsjava.experiments.experimentheapstack;

public class PersonBuilder {

    private static Person buildPerson(int id, String name) {
        System.out.println("buildPerson");
        return new Person(id, name);
    }

    public static void main(String[] args) {
        int id = 23; // stack
        String name = "John"; // name in stack -- "John" in heap
        Person person = null; // person in stack -- no heap data
        person = buildPerson(id, name); // person link in stack buildPerson(id, name) object data in heap
    }

}
