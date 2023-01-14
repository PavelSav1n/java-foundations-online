package ru.itsjava.homeWork.oop.homeWork2;

public class Iron {

    // Поля
    private String name;
    private int watt;
    private double price;

    // Конструктор #0 без аргументов
    public Iron() {

    }

    // Конструктор #1/3 с одним аргументом
    public Iron(String name) {
        this.name = name;
    }

    // Конструктор #2/3 с одним аргументом
    public Iron(int watt) {
        this.watt = watt;
    }

    // Конструктор #3/3 с одним аргументом
    public Iron(double price) {
        this.price = price;
    }

    // Конструктор #1/3 с двумя аргументами
    public Iron(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Конструктор #2/3 с двумя аргументами
    public Iron(String name, int watt) {
        this.name = name;
        this.watt = watt;
    }

    // Конструктор #3/3 с двумя аргументами
    public Iron(int watt, double price) {
        this.watt = watt;
        this.price = price;
    }

    // Конструктор #1/1 с тремя аргументами
    public Iron(String name, int watt, double price) {
        this.name = name;
        this.watt = watt;
        this.price = price;
    }

    // Методы
    public void setName(String name) {
        this.name = name;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWatt() {
        return watt;
    }

    public double getPrice() {
        return price;
    }
}
