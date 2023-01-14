package ru.itsjava.homeWork.methods;

import java.util.Arrays;

public class MethodsPractice2 {

    public static void main(String[] args) {
        int[] array = new int[]{1, -2, 0, 3};
        int num = 5;

        arrayToZeroArray(array);
        System.out.println(Arrays.toString(array));

        num = numToZero();
        System.out.println(num);
    }

    // Передаём копию ссылки
    public static void arrayToZeroArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;

        }
    }

    // передаём примитивные типы. В данном случае ничего не передаём
    public static int numToZero() {
        return 0;
    }
}
