package ru.itsjava.homeWork.sorting;

import java.util.Arrays;

public class QuickSortPS {

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 4, 1, 3, 7, 2, 14, 7, 10, 9, 8, 11, 12, 13};
        System.out.println("Было");
        System.out.println(Arrays.toString(array));

        int leftBorder = 0;
        int rightBorder= array.length - 1;

        quickSortPS(array, leftBorder, rightBorder);
        System.out.println("Стало");
        System.out.println(Arrays.toString(array));


    }

    public static void quickSortPS(int[] array, int leftBorder, int rightBorder) {
        // Завершаем, если рекурсия достигла предела деления массива на подмассивы
        if (leftBorder >= rightBorder) return;
        // Выставляем границы подмасива по границам входящего массива.
        // Будем бежать по индексам от левой и правой границ подмассива.
        int leftDynamicIndex = leftBorder;
        int rightDynamicIndex = rightBorder;
        // Опорный индекс у нас всегда будет средним индексом подмассива
        int pivotIndex = leftDynamicIndex + (rightDynamicIndex - leftDynamicIndex) / 2;
        // Нам нужно значение опорного индекса подмассива
        int pivotValue = array[pivotIndex];
        // Идём до тех пор, пока левый и правый динамические индексы не пересекутся
        while (leftDynamicIndex <= rightDynamicIndex) {
            // Идём по ЛЕВОЙ стороне подмассива пока не найдём число БОЛЬШЕ или РАВНЫЙ опорного
            while (array[leftDynamicIndex] < pivotValue) {
                leftDynamicIndex++;
            }
            // Идём по ПРАВОЙ стороне подмассива пока не найдём число МЕНЬШЕ или РАВНЫЙ опорного
            while (array[rightDynamicIndex] > pivotValue) {
                rightDynamicIndex--;
            }
            // Если мы подошли к этому моменту, значит мы нашли пару чисел, проверяем, не были ли эти числа уже отсортированы в этой рекурсии
            // FALSE -- динамические индексы пересеклись, значит мы нашли пару в которой как минимум одно из чисел уже отсортировано
            // TRUE -- Если динамические индексы не пересеклись, значит меняем их содержимое местами
            if (leftDynamicIndex <= rightDynamicIndex) {
                int temp = array[leftDynamicIndex];
                array[leftDynamicIndex] = array[rightDynamicIndex];
                array[rightDynamicIndex] = temp;
                // после чего идём дальше искать
                leftDynamicIndex++;
                rightDynamicIndex--;
            }
        }
        // TRUE -- Если между левой границей данного массива и правым динамическим индексом (ДИ) ещё есть подмассив. Заходим внутрь.
        // FALSE -- Если правый ДИ добежал до левой границы и стал ему равен или больше, значит слева от опорного больше нет подмассивов. Идём мимо.
        if (leftBorder < rightDynamicIndex)
            //Берём подмассив слева от опорного значения, устанавливаем левую границу из предыдущего подмассива и устанавливаем правую границу по правому ДИ
            quickSortPS(array, leftBorder, rightDynamicIndex);
        // TRUE -- Если между правой границей данного массива и левым ДИ ещё есть подмассив. Заходим внутрь.
        // FALSE -- Если левый динамический индекс добежал до правой границы и стал ему равен или больше, значит справа от опорного больше нет подмассивов. Идём мимо.
        if (rightBorder > leftDynamicIndex)
            // Берём подмассив справа от опорного значения, устанавливаем левую границу по левому ДИ и берём правую из предыдущего подмассива.
            quickSortPS(array, leftDynamicIndex, rightBorder);

    }

}
