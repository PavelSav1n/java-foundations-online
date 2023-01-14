package ru.itsjava.homeWork.oop.homeWork2;

public class Computer {

    // Поля
    private String name;
    private String type;
    private double price;


    // Конструктор 0 без аргементов
    public Computer() {
    }

    // Конструктор #1/2 с одним аргументом String
    public Computer(String name) {
        this.name = name;
    }

    // Конструктор #2/2 с одним аргументом double
    public Computer(double price) {
        this.price = price;
    }

    // Конструктор #1/2 с двумя аргументами String и double
    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Конструктор #2/2 с двумя аргументами String и String
    public Computer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Конструктор #1/1 с тремя аргументами String, String и double
    public Computer(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;

    }

    // Методы
    public void about() {
        System.out.println("Name:" + name + "\nType: " + type + "\nPrice: $" + price);
        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
