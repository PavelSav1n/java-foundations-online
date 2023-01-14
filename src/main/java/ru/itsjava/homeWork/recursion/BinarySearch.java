package ru.itsjava.homeWork.recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // 1. Отсортированный массив
        // Найти: позицию элемента в этом массиве

        //                       0   1   2  3  4  5  6  7  8
        int[] array = new int[]{-6, -3, -2, 0, 1, 5, 6, 7, 8};

        int pos0 = binarySearch(0, 0, array.length, array);
        System.out.println("Позиция 0 в массиве " + Arrays.toString(array) + " равно" + pos0);

        int posMinusSix = binarySearch(-6, 0, array.length, array);
        System.out.println("Позиция -6 в массиве " + Arrays.toString(array) + " равно " + posMinusSix);

        int pos8 = binarySearch(8, 0, array.length, array);
        System.out.println("Позиция 8 в массиве " + Arrays.toString(array) + " равно " + pos8);
    }

    private static int binarySearch(int num, int beginIndex, int endIndex, int[] array) {

        //                                    эта сумма может быть больше int
        // ниже то же самое, что и int midIndex = (beginIndex + endIndex) / 2 только не выходим за пределы int
        int midIndex = beginIndex + (endIndex - beginIndex) / 2;

        // Базовый случай
        if (num == array[midIndex]) return midIndex;

        // Условие продолжения
        // Если загаданное число больше среднего, то среднее становится нижней планкой
        if (num > array[midIndex]) return binarySearch(num, midIndex, endIndex, array);
        // Если загаданное число меньше среднего, то среднее становится верхней планкой
        return binarySearch(num, beginIndex, midIndex, array);


    }
}