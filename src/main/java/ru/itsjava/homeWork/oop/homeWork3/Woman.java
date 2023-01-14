package ru.itsjava.homeWork.oop.homeWork3;

public class Woman extends Person {

    // Поля
//    public String name;
//    public int age;

    //Конструктор
    public Woman() {

    }

    public Woman(String name, int age) {
        super(name, age);
    }

    // Методы
    @Override
    public void printAge() {
        System.out.println("Возраст всегда 18 ");
    }
}
