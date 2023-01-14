package ru.itsjava.homeWork.recursion;

import java.util.Arrays;

public class FiboSearch {

    public static void main(String[] args) {

        // index: 0  1  2  3  4  5  6  7   8  9  10
        // value: 0  1  1  2  3  5  8  13  21 34 55

        int n = 10; // член последовательности, который будем искать
        System.out.println(n + " - член последовательности Фибоначчи = " + fiboSearchByIndex(n));

        // Массив размером 30, который будем заполнять
        // Сделал для себя, не обращайте внимания
        int[] array = new int[30];
        System.out.println("fiboFillInArray(array) = " + Arrays.toString(fiboFillInArray(array)));

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i + ": " + array[i] + " ,");
//
//        }
    }

    public static int fiboSearchByIndex(int n) {

        // Базовый случай
        if (n == 1) return 1;
        if (n < 0) return 0;

        //Условие продолжения
        return fiboSearchByIndex(n - 1) + fiboSearchByIndex(n - 2);

    }

    // Заполнение массива последовательностью Фибоначчи
    public static int[] fiboFillInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = fiboSearchByIndex(i);
        }
        return array;
    }

}
