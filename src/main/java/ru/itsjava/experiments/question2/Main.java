package ru.itsjava.experiments.question2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("1", "2", "3")); // Создаём изменяемый список
        ImmutableList immutableList = new ImmutableList(list); // Создаём неизменяемый список

        list.add("4"); // Добавляем элемент в изменяемый список.
        System.out.println(list); // => [1, 2, 3, 4] тут элемент добавится
        System.out.println(immutableList.getList()); // => [1, 2, 3] тут нет, потому что это новый ArrayList с данными из первоначального изменяемого списка

        List<String> testList = immutableList.getList(); // Присвоим новой переменной данные из неизменяемого списка.
        testList.add("5");
        System.out.println(testList); // => [1, 2, 3, 5]
        System.out.println("testList.hashCode() = " + testList.hashCode());
        System.out.println(immutableList.getList()); // => [1, 2, 3]

        System.out.println("(testList == immutableList.getList()) = " + (testList == immutableList.getList()));


    }
}
