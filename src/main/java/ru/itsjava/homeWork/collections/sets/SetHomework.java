package ru.itsjava.homeWork.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetHomework {
    public static void main(String[] args) {

        // Создали класс Fruit с полями наименование и вес:
        Fruit apple = new Fruit("Яблоко", 50.0);
        Fruit pineapple = new Fruit("Ананас", 200.0);
        Fruit orange = new Fruit("Апельсин", 55.0);

        // Создаём множество фруктов
        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(apple, pineapple,orange));

        // Добавляем фрукт:
        Fruit peach = new Fruit("Персик", 40.0);
        System.out.println("fruitSet.add(peach) = " + fruitSet.add(peach)); // true
        // Добавляем тот же фрукт:
        System.out.println("fruitSet.add(peach) = " + fruitSet.add(peach)); // false
        // Удаляем фрукт из множества:
        fruitSet.remove(apple);
        // Проверяем содержится ли фрукт в множестве фруктов:
        System.out.println("fruitSet.contains(apple) = " + fruitSet.contains(apple)); // false
        System.out.println("fruitSet = " + fruitSet);


    }
}
