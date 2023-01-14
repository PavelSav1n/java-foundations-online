package ru.itsjava.homeWork.methods;

import java.util.Scanner;

public class HomeWorkWithMethods {
    public static void main(String[] args) {


        //Lesson 2. Exercise #2
        System.out.println("Lesson 2. Exercise #2");
        printILoveHomeWork();

        //Lesson 2. Exercise #3
        int num1 = 10;
        int num2 = 7;

        //Lesson 2. Exercise #4
        System.out.println("Lesson 2. Exercise #4");
        printLesson2Exercise4Result(num1, num2);


        //Lesson 2. Exercise #5
        // операции с логическим сравнением
        System.out.println("Lesson 2. Exercise #5");
        printLogicalOperatorsResult(5, 7);

        Scanner console = new Scanner(System.in);

        //Lesson 4. Exercise #1
        System.out.println("Lesson 4. Exercise #1");
        System.out.print("Enter first number: ");
        int firstNumFromConsole = console.nextInt();
        System.out.print("Enter second number: ");
        int secondNumFromConsole = console.nextInt();
        printMaxNumber(firstNumFromConsole, secondNumFromConsole);

        //Lesson 4. Exercise #2
        System.out.println("Lesson 4. Exercise #2");
        System.out.print("Enter first number: ");
        firstNumFromConsole = console.nextInt();
        System.out.print("Enter second number: ");
        secondNumFromConsole = console.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumFromConsole = console.nextInt();
        printMinNumber(firstNumFromConsole, secondNumFromConsole, thirdNumFromConsole);

        //Lesson 4. Exercise #3
        System.out.println("Lesson 4. Exercise #3");
        System.out.print("Enter an age of the man: ");
        int mensAgeFromConsole = console.nextInt();
        printAgeCheckArmyResult(mensAgeFromConsole);

        //Lesson 4. Exercise #5 with temp variable
        System.out.println("Lesson 4. Exercise #5 with temp variable");
        num1 = 3;
        num2 = 5;
        printSwappedNumbers(num1, num2);

        //Lesson 4. Exercise #5 with only 2 variables
        System.out.println("Lesson 4. Exercise #5 with only 2 variables");
        //num1 & num2 already assigned
        //num1 = 3;
        //num2 = 5;
        printSwappedNumbers2(num1, num2);

        //Lesson 4. Exercise #6
        System.out.println("Lesson 4. Exercise #6 -- ax^2+bx+c=0");
        System.out.print("Enter 'a': ");
        double aFromConsole = console.nextDouble();
        System.out.print("Enter 'b': ");
        double bFromConsole = console.nextDouble();
        System.out.print("Enter 'c': ");
        double cFromConsole = console.nextDouble();
        printFoundedRootsOfQuadraticEquation(aFromConsole, bFromConsole, cFromConsole);


        System.out.println("Lesson 6. Exercise #1");
        printILoveJava10times();


        //                                0  1  2  3   4  5
        int[] arrayLesson6 = new int[]{3, 5, 0, 4, -1, 9};
        System.out.println();
        System.out.println("Lesson 6. Exercise #2");
        print3And5ArrayElement(arrayLesson6);


        System.out.println();
        System.out.println("Lesson 6. Exercise #3");
        printArrayLength(arrayLesson6);

        System.out.println();
        System.out.println("Lesson 6. Exercise #4");
        printILoveWritingProgramsOnJava3Times();

        System.out.println();
        System.out.println("Lesson 6. Exercise #5");
        printNumbersArrayInFigureBrackets(arrayLesson6);


        //Array for Lesson 7:
        int[] arrayLesson7 = new int[]{5, 8, 10, 12, 15};

        System.out.println("Lesson 7. Exercise #1");
        System.out.println("Odd elements of array: ");
        printOddArrayElements(arrayLesson7);
        System.out.println();
        System.out.println();


        System.out.println("Lesson 7. Exercise #2");
        System.out.println("First 4 elements of array: ");
        printFirstFourArrayElements(arrayLesson7);
        System.out.println();
        System.out.println();


        System.out.println("Lesson 7. Exercise #3");
        System.out.println("Last 4 elements of array: ");
        printLastFourArrayElements(arrayLesson7);
        System.out.println();


        //Array for Lesson 8:
        int[] arrayLesson8 = new int[]{5, -8, 10, 0, -12, 15};

        System.out.println("Lesson 8. Exercise #1");
        System.out.println("Minimum element of the array is: " + minimumArrayElement(arrayLesson8));


        System.out.println();
        System.out.println("Lesson 8. Exercise #2 -- show only elements multiple of 5");
        printMultipleOfFiveArrayElements(arrayLesson8);
        System.out.println();

        System.out.println();
        System.out.println("Lesson 8. Exercise #3");
        System.out.println("Sum of even indexes of the array is: " + sumOfEvenArrayIndexes(arrayLesson8));


        System.out.println();
        System.out.println("Lesson 8. Exercise #4");
        printFirstMultipleOfFiveArrayElement(arrayLesson8);


    }

    //Lesson 2. Exercise #2
    public static void printILoveHomeWork() {
        System.out.println("Я люблю домашние задания");
    }

    //Lesson 2. Exercise #4
    public static void printLesson2Exercise4Result(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // сложение переменных
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // вычитание переменных
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // умножение переменных
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // деление переменных
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // остаток от деления переменных
        System.out.println(++num1); // префиксный инкремент переменной
        System.out.println(num2--); // постфиксный декремент переменной (тут будет 7)
        System.out.println(num2); // а тут будет уже 6
    }

    //Lesson 2. Exercise #5
    public static void printLogicalOperatorsResult(int num1, int num2) {
        System.out.println(num1 + " > " + num2 + " is " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " is " + (num1 < num2));
        System.out.println(num1 + " <= " + num2 + " is " + (num1 <= num2));
        System.out.println(num1 + " >= " + num2 + " is " + (num1 >= num2));
        System.out.println(num1 + " == " + num2 + " is " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " is " + (num1 != num2));
    }

    //Lesson 4. Exercise #1
    public static void printMaxNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Max number is " + num1);
        } else if (num1 < num2) {
            System.out.println("Max number is " + num2);
        } else {
            System.out.println("Both numbers are equal: " + num2);
        }
    }

    //Lesson 4. Exercise #2
    public static void printMinNumber(int num1, int num2, int num3) {
        if ((num1 <= num2) && (num1 <= num3)) {
            System.out.println(num1 + " -- is minimum");
        } else if ((num2 <= num1) && (num2 <= num3)) {
            System.out.println(num2 + " -- is minimum");
        } else {
            System.out.println(num3 + " -- is minimum");
        }
    }

    //Lesson 4. Exercise #3
    public static void printAgeCheckArmyResult(int age) {
        if ((age <= 0) || (age >= 100)) {
            System.out.println("Incorrect mens age");
        } else if (age < 18) {
            System.out.println("Too young for the army");
        } else if (age < 27) {
            System.out.println("You're in the army now!");
        } else {
            System.out.println("Too late");
        }
    }

    //Lesson 4. Exercise #5
    public static void printSwappedNumbers(int num1, int num2) {
        int temp;
        System.out.println("Original:");
        System.out.println("num1 = " + num1 + " and num2 = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Reversed:");
        System.out.println("num1 = " + num1 + " and num2 = " + num2);
    }

    //Lesson 4. Exercise #5 (two variables)
    public static void printSwappedNumbers2(int num1, int num2) {
        System.out.println("Original:");
        System.out.println("num1 = " + num1 + " and num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Reversed:");
        System.out.println("num1 = " + num1 + " and num2 = " + num2);
    }

    //Lesson 4. Exercise #6
    public static void printFoundedRootsOfQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        System.out.println("Discriminant is: " + discriminant);

        if (discriminant < 0) {
            System.out.println("The quadratic function has no real roots");
        } else if (discriminant == 0) {
            double quadraticFunctionRoot = (b * (-1)) / (2 * a);
            System.out.println("The quadratic function root is: " + quadraticFunctionRoot);
        } else {
            double quadraticFunctionRoot1 = ((b * (-1)) + Math.sqrt(discriminant)) / 2 * a;
            double quadraticFunctionRoot2 = ((b * (-1)) - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("First quadratic function root is: " + quadraticFunctionRoot1);
            System.out.println("Second quadratic function root is: " + quadraticFunctionRoot2);
        }
    }

    //Lesson 6. Exercise #1
    public static void printILoveJava10times() {
        int i = 0;
        while (i < 10) {
            System.out.println("Я люблю Java!");
            i++;
        }
    }

    //Lesson 6. Exercise #2
    public static void print3And5ArrayElement(int[] numbersArray) {
        System.out.println("Third array element: " + numbersArray[2]);
        System.out.println("Fifth array element: " + numbersArray[4]);
    }

    //Lesson 6. Exercise #3
    public static void printArrayLength(int[] numberArray) {
        System.out.println("Array length = " + numberArray.length);
    }

    //Lesson 6. Exercise #4
    public static void printILoveWritingProgramsOnJava3Times() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Я люблю писать программы на Java!");
        }
    }

    //Lesson 6. Exercise #5
    public static void printNumbersArrayInFigureBrackets(int[] numbersArray) {
        System.out.print("Массив:{ ");
        for (int i = 0; i < numbersArray.length; i++) {
            if (i != (numbersArray.length - 1)) {
                System.out.print(numbersArray[i] + ", ");
            } else {
                System.out.println(numbersArray[i] + "}");
            }
        }
    }


    //Lesson 7. Exercise #1
    public static void printOddArrayElements(int[] numbersArray) {
        for (int i = 1; i < numbersArray.length; i += 2) {
            System.out.print(numbersArray[i] + " ");
        }
    }

    //Lesson 7. Exercise #2
    public static void printFirstFourArrayElements(int[] numbersArray) {
        for (int i = 0; i < 4; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }

    //Lesson 7. Exercise #3
    public static void printLastFourArrayElements(int[] numbersArray) {
        for (int i = numbersArray.length - 4; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }


    //Lesson 8. Exercise #1
    public static int minimumArrayElement(int[] numbersArray) {
        int minimum = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] < minimum) minimum = numbersArray[i];
        }
        return minimum;
    }

    //Lesson 8. Exercise #2
    public static void printMultipleOfFiveArrayElements(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            if ((numbersArray[i] % 5 == 0) && (numbersArray[i] != 0)) System.out.print(numbersArray[i] + " ");
        }
    }

    //Lesson 8. Exercise #3
    public static int sumOfEvenArrayIndexes(int[] numbersArray) {
        int sumEvenIndex = 0;
        System.out.print("Even indexes are: ");
        for (int i = 0; i < numbersArray.length; i += 2) {
            System.out.print(numbersArray[i] + " ");
            sumEvenIndex += numbersArray[i];
        }
        System.out.println();
        return sumEvenIndex;
    }

    //Lesson 8. Exercise #4
    public static void printFirstMultipleOfFiveArrayElement(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            if ((numbersArray[i] % 5 == 0) && (numbersArray[i] != 0)) {
                System.out.print("First array element multiple of 5 is: " + numbersArray[i]);
                break;
            }
        }
    }
}