package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        Man andrey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man vitya = new Man("Vitya");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya));
        System.out.println("manSet = " + manSet);

        // Невозможно добавить, т.к. андрей уже есть:
        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));

        // Создадим новый объект с такими же данными:
        Man andrey2 = new Man("Andrey");
        // Поскольку @Data переопределил метод equals() в Man, сравнивается содержимое и поэтому новый объект не добавиться:
        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));

        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));
        System.out.println("manSet.size() = " + manSet.size());
        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
        System.out.println("manSet = " + manSet);

    }
}
