package ru.itsjava.collections.lists;

import org.ietf.jgss.GSSContext;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
//           <>generic -- ожидаемый объект, чтобы не было возможности запихать в эту коллекцию другие обоъекты, например ручки
        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch gShock = new Watch("GSHOCK", "Best dancer", 10_000.0);

        watchesList.add(seiko);
        watchesList.add(gShock);

//        System.out.println("watchesList = " + watchesList);

        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }

//        watchesList.remove(0);
        watchesList.remove(seiko);
        System.out.println("After remove(seiko):");
        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }
        System.out.println("Contains():");
        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));

        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());

        watchesList.set(0, seiko);

        System.out.println(watchesList);

        System.out.println("watchesList.size() = " + watchesList.size());

        // **** second practice ****

        // Создаём ещё один ArrayList
        List<Watch> watchesOmegaList = new ArrayList<>();

        // Создаём объёкты которые будем добавлять в watchesOmegaList
        Watch andrewOmega = new Watch("Omega", "Andrew", 100_000.0);
        Watch romaOmega = new Watch("Omega", "Roma", 100_000.0);

        // Добавляем
        watchesOmegaList.add(andrewOmega);
        watchesOmegaList.add(romaOmega);

        System.out.println("watchesOmegaList = " + watchesOmegaList);

        // Добавляем все объекты watchesOmegaList в список watchesList
        watchesList.addAll(watchesOmegaList);

        System.out.println("watchesList = " + watchesList);

        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 20_000.0);

        // Вставляем объект vitaliyWatch в список watchesList на место по индексу 1
        watchesList.add(1, vitaliyWatch);

        System.out.println("watchesList = " + watchesList);


    }
}
