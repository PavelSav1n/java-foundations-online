package ru.itsjava.experiments.gettersetter;

public class Person {

    private final int birthYear; // final field must be set in Constructor & cannot be changed via setter
    private String name;
    private Person child;


    public Person(int birthYear, String name) {
        this.birthYear = birthYear; // obligatory
        this.name = name;
    }

    // Don't get it why we need this.
    // Seems to work fine without
    public Person(int birthYear1, String name1, Person child1) {
        birthYear = birthYear1; // obligatory
        name = name1;
        child = child1;
    }

    public void setChild(Person child) {
        this.child = child;
    }

    public void setName(String name1) {
        name = name1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                ", child=" + child +
                '}';
    }
}
