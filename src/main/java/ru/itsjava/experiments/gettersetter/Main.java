package ru.itsjava.experiments.gettersetter;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(1990, "Andrew");
        Person p2 = new Person(1970, "Anna", p1);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        p2.setName("Anna2");
        System.out.println("p2 = " + p2);

        p1.setName("Boris");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }
}
