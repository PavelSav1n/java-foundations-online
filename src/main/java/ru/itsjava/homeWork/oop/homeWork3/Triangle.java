package ru.itsjava.homeWork.oop.homeWork3;

//Класс Треугольник
public class Triangle extends Figure {
    // Поля
    private int sideA;
    private int sideB;
    private int sideC;

    // Конструктор
    public Triangle() {
        System.out.println("Пустой конструктор треугольника");
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    // Методы
    // Вернуть значение периметра треугольника
    @Override
    public double getPerimeter() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.print("Стороны треугольника должны быть больше 0! ");
            return 0;
        }
        return sideA + sideB + sideC;
    }

    // Вернуть значение площади треугольника
    @Override
    public double getArea() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.print("Стороны треугольника должны быть больше 0! ");
            return 0;
        }
        // Используем формулу Герона для рассчёта площади
        int halfPerimeter = (sideA + sideB + sideC) / 2;
        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        // Если сумма двух сторон меньше либо равна третьей, то этот треугольник невозможно построить в евклидовой геометрии
        if (triangleArea <= 0 || Double.isNaN(triangleArea)) {
            System.out.print("Проверьте корректность длины сторон треугольника: ");
            return 0;
        }
        return triangleArea;

    }

}
