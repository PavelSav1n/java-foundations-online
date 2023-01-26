package ru.itsjava.homeWork.oop.homeWork3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {
    private double radius;
    private static final double PI = 3.14159265359;

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    }
}
