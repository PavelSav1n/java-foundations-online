package ru.itsjava.homeWork.oop.homeWork8;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {

    private String manufacturer;
    private String color;
    private  static double cost = 1_000.0;

    public void changeCost(double newCost) {
        cost = newCost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
