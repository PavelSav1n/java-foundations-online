package ru.itsjava.homeWork.methods;

public class MethodsPractice {
    public static void main(String[] args) {

//        int num1 = 15;
//        int num2 = 7;
//
//        if (num1 > num2) {
//            System.out.println("Max num is: " + num1);
//        } else {
//            System.out.println("Max num is: " + num2);
//        }
//
//        int num3 = 6;
//        int num4 = 10;
//
//        if (num3 > num4) {
//            System.out.println("Max num is: " + num3);
//        } else {
//            System.out.println("Max num is: " + num4);
//        }
        printMaxValue(15, 7);
        printMaxValue(1, 10);

        //Найти максимальное значение и увеличить его на 10

        System.out.println("Максимум из 3 и 12:");
        System.out.println("(getMaxValue(3,12) +10) = " + (getMaxValue(3, 12) + 10));
    }

    public static void printMaxValue(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Max num is: " + num1);
        } else {
            System.out.println("Max num is: " + num2);
        }
    }

    public static int getMaxValue(int num1, int num2) {
        if (num1 > num2) return num1;
        return num2;
    }

    public static int getMinValue(int num1, int num2) {
        if (num1 < num2) return num1;
        return num2;
    }

}

