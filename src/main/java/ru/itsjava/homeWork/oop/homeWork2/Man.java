package ru.itsjava.homeWork.oop.homeWork2;

public class Man {

    // поля (private)
    private String name;
    private int age;

    public Man() {
//        super();
        System.out.println("Man Constructor");
    }

    // конструктор
    public Man(String name, int age) {
//        super(name, age);
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
