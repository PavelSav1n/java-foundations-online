package ru.itsjava.homeWork.oop.homeWork8;

public class homeWork8 {

    public static void main(String[] args) {

        Car bentley = new Car("Bentley", "white");
        Car zhiguli = new Car("Zhiguli", "black");

        System.out.println("bentley = " + bentley);
        System.out.println("zhiguli = " + zhiguli);

        // меняем статическую переменную в бентли -- меняем для всего класса:
        bentley.changeCost(99_000.0);

        System.out.println("bentley = " + bentley);
        System.out.println("zhiguli = " + zhiguli);

    }
}
