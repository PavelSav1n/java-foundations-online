package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Salary {
    private final double baseSalary;
    // static общее поле для всего класса без привязки к экземплярам класса
    private static double increaseCoefficient = 2.5;
    // так объявляем константы:
    public final static double SALARY_CEO = 500_000.0;

    public double getFullSalary() {
        return baseSalary * increaseCoefficient;
    }

    // Статичный метод, который так же не привязан к экземпляру класса. Используем внутри только поля класса static
    public static void setIncreaseCoefficient(double increaseCoefficient1){
        increaseCoefficient = increaseCoefficient1;

    }

}
