package ru.itsjava.homeWork.oop.homeWork3;

public class Man extends Person {

    // поля (private)
    private String name;
    private int age;

    public Man() {
//        super();
        System.out.println("Man Constructor");
    }

    // конструктор
    public Man(String name, int age) {
        super(name, age);


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

}
