package ru.itsjava.homeWork.oop.homeWork3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {
    private double radius;

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
