package ru.itsjava.homeWork.oop.homeWork3;

// Класс Квадрат
public class Square extends Figure {
    // Поля
    private int sideA;

    // Конструктор
    public Square() {

    }

    public Square(int sideA) {
        this.sideA = sideA;
    }

    // Методы
    // Вернуть значение периметра квадрата
    @Override
    public double getPerimeter() {
        if (sideA <= 0) {
            System.out.print("Проверьте корректность длины сторон квадрата: ");
            return 0;
        }
        return sideA * 4;
    }

    // Вернуть значение площади квадрата
    @Override
    public double getArea() {
        if (sideA <= 0) {
            System.out.print("Проверьте корректность длины сторон квадрата: ");
            return 0;
        }
        return sideA * sideA;
    }
}
