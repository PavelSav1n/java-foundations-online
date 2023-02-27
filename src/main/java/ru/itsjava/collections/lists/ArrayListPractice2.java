package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(viktorSeiko, viktorSeiko, dmitriySeiko, valentinOmega));

        System.out.println("Наши часы: " + watches);

        // Вевести все часы Seiko
        System.out.println("Вевести все часы Seiko:");
        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.print(elemWatch + " ");
            }
        }

        System.out.println();
        System.out.println("Вывести все часы стоимостью > 30_000.0");
        for (Watch elemWatch : watches){
            if (elemWatch.getPrice()>30_000.0){
                System.out.print(elemWatch + " ");
                // break // если требуется вывести только первый подходящий элемент
            }
        }

        // Вывести все Seiko, но Пропустить первых два элемента фирмы Seiko
        System.out.println();
        System.out.println("Пропустить первых два элемента фирмы Seiko:");
        int countSeiko = 0; // счётчик для Seiko
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm() == "Seiko"){
                countSeiko++;
                if (countSeiko>2) {
                    System.out.println(watches.get(i).toString());
                }
            }

        }


        // Вывести все часы, но Пропустить первых два элемента фирмы Seiko
        System.out.println();
        System.out.println("Пропустить первых два элемента фирмы Seiko:");
        countSeiko = 0; // счётчик для Seiko
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && countSeiko<2){
                countSeiko++;
            } else
            {
                System.out.println("watches.get(i) = " + watches.get(i));
            }

        }



    }
}
