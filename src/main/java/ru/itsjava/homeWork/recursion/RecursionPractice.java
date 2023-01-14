package ru.itsjava.homeWork.recursion;

public class RecursionPractice {
    public static void main(String[] args) {

        System.out.println("fact (5) = " + fact(5));
//        System.out.println("fact (5) = " + fact(-1));



    }


    public static int fact(int num) {
        if (num<0) {
            System.err.println("Factorial of " + num + " is not defined");
            return 0;
        }
        // Базовый случай
        if ((num == 1) || (num == 0)) return 1;

        // Условие перехода
        return num * fact(num - 1);

    }


}
// 0! = 1! = 1
// 5! = 5 * 4 * 3 * 2 * 1