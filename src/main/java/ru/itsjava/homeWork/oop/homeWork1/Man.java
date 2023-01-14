package ru.itsjava.homeWork.oop.homeWork1;

public class Man {

    // поля (private)
    private String name;
    private int age;

    public Man() {

    }

    // конструктор
    public Man(String name, int age) {
        this.name = name;
        this.age = age;


    }

    // методы
    public void sayHello() {
        System.out.println(name + " is " + age + " years old and says: 'Hello!'");
    }

    public void setName(String setNameInput) {
        this.name = setNameInput;
    }

    public void setAge(int setAgeInput) {
        this.age = setAgeInput;
    }

    public String getName() {
        return name;
    }
}
