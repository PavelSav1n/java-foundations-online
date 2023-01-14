package ru.itsjava.homeWork.oop.homeWork3;

public class Person {

    // Поля
    private String name;
    private int age;

    // Конструктор

    public Person() {
        System.out.println("Empty constructor of Person class");

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }


    // Методы
    public void printAge() {
        System.out.println("Возраст: " + age);
    }

    public String getName() {
        return name;
    }
}
