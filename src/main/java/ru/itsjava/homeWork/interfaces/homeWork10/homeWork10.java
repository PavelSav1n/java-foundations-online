package ru.itsjava.homeWork.interfaces.homeWork10;

import java.util.Arrays;

//1. Создать класс Person ( Поля: Имя, Фамилия и возраст)
//2. Реализовать интерфейс Comparable. Реализовать метод compareTo(), который будет сравнивать человека по фамилии, если фамилии одинаковые, то по имени, если имена одинаковые, то по возрасту.
//3. В классе Main добавить в массив несколько человек. Отсортировать и вывести на экран.
//4. В классе Person реализовать метод clone()
//5. В классе Main создать клона некоторого Person.

public class homeWork10 {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", "Ivanov", 18);
        Person petr = new Person("Petr", "Ivanov", 29);
        Person igor = new Person("Igor", "Vasiliev", 31);
        Person ivan2 = new Person("Ivan", "Ivanov", 34);
        Person ivan3 = new Person("Ivan", "Rodionov", 53 );
        System.out.println("ivan.compareTo(petr) = " + ivan.compareTo(petr));
        System.out.println("ivan.compareTo2(petr) = " + ivan.compareTo2(petr));
        System.out.println("ivan.compareTo(igor) = " + ivan.compareTo(igor));
        System.out.println("ivan.compareTo2(igor) = " + ivan.compareTo2(igor));
        System.out.println("ivan.compareTo(ivan2) = " + ivan.compareTo(ivan2));
        System.out.println("ivan.compareTo2(ivan2) = " + ivan.compareTo2(ivan2));
        System.out.println("ivan.compareTo(ivan3) = " + ivan.compareTo(ivan3));
        System.out.println("ivan.compareTo2(ivan3) = " + ivan3.compareTo2(ivan));

        Person[] persons = {ivan, petr, igor, ivan2, ivan3};
        System.out.println("persons before Arrays.toString() " + Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println("persons after Arrays.toString() = " + Arrays.toString(persons));

        Person igor2 = igor.clone();
        System.out.println("igor2 = " + igor2);
        System.out.println("igor.compareTo(igor2) = " + igor.compareTo(igor2));


    }
}
