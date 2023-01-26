package ru.itsjava.homeWork.oop.homeWork3;

// Класс Треугольник
public class Rectangle extends Figure {
    // Поля
    private int sideA;
    private int sideB;

    // Конструктор
    public Rectangle() {

    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Методы
    // Вернуть значение периметра прямоугольника
    @Override
    public double getPerimeter() {
        if (sideA <= 0 || sideB <= 0) {
            System.out.print("Проверьте корректность длины сторон квадрата: ");
            return 0;
        }
        return sideA * 2 + sideB * 2;
    }

    // Вернуть значение площади прямоугольника
    @Override
    public double getArea() {
        if (sideA <= 0 || sideB <= 0) {
            System.out.print("Проверьте корректность длины сторон квадрата: ");
            return 0;
        }
        return sideA * sideB;
    }
}
