package ru.itsjava.homeWork.sorting;

import java.util.Arrays;

public class BubbleSortPS {
    public static void main(String[] args) {

        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        // Реализация через for
//        // Повторяем сортировку array.length -- раз.
//        for (int a = 0; a < array.length; a++) {
//            // Прижимаем наибольшее число вправо до уже остортированного array.length - 1 - a индекса
//            for (int i = 0; i < array.length - a - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int tmp = array[i + 1];
//                    array[i + 1] = array[i];
//                    array[i] = tmp;
//                }
//
//            }
//        }

        // Реализация через метод bubbleSortPS с рекурсией

        bubbleSortPS(0, array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }

    public static int[] bubbleSortPS(int alreadySorted, int[] array) {

        // Базовый случай
        // Когда количество отсортированных индексов приравнивается к длине массива -1
        if (alreadySorted == array.length - 1) return array;

        // Условие продолжения
        // Каждый цикл меньше предыдущего на количество уже отсортированных чисел.
        // Количество циклов должно быть меньше array.length на 1, потому что всего операций по замене местами должно быть на 1 меньше общей длинны массива по своей сути
        for (int i = 0; i < array.length - 1 - alreadySorted; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = tmp;
            }
        }
        return bubbleSortPS(alreadySorted + 1, array);
    }

}
