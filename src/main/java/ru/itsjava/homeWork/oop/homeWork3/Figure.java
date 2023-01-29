package ru.itsjava.homeWork.oop.homeWork3;

public abstract class Figure {

    // Поля
    static final double PI = 3.14159265359;

    //Конструктор
    public Figure() {
        // System.out.println("Пустой конструктор фигуры");
    }

    //Методы

    //    public double getPerimeter() {
//        System.out.println("Периметр внутри суперкласса Figure");
//        return 0;
//    }

    public abstract double getPerimeter();

//    public double getArea() {
//        System.out.println("Площадь внутри суперкласса Figure");
//        return 0;
//    }

    public abstract double getArea();
}
