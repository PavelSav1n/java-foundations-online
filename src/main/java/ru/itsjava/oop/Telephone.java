package ru.itsjava.oop;

public class Telephone {
    // Поля
    private final String brand;
    private boolean isHomey;

    // Конструктор

    public Telephone(String brand) {
        this.brand = brand;
    }

    public Telephone(String brand, boolean isHomey) {
        this.brand = brand;
        this.isHomey = isHomey;
    }

    // Методы
    public String toString() {
        return "{ brand: " + brand + " isHomey: " + isHomey + "}";
    }
}
