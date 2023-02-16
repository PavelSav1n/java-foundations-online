package ru.itsjava.homeWork.exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {

        // Успешно выполнится
        Person ivan = new Person("Ivan", 50);
        System.out.println("ivan = " + ivan);

        // Тут будет проброшено исключение в конструкторе класса Person
        Person petr = new Person("Petr", 151);

        // До сюда мы не дойдём
        Person vanya = new Person("Vanya", 20);
        System.out.println("vanya = " + vanya);

    }
}
