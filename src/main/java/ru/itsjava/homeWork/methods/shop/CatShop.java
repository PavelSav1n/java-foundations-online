package ru.itsjava.homeWork.methods.shop;

import java.util.Scanner;

public class CatShop {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш котомагазин!");
        String[] catsArray = new String[]{"Чёрный_кот", "Белый_кот", "Серый_кот", "Жирный_кот", "Хитрый_кот", "Домашний_кот", "Украинский_кiт"};


        printMenu();
        Scanner console = new Scanner(System.in);

        System.out.print("Введите номер меню: ");
        int menuNum = console.nextInt();

        while (true) {
            if (menuNum == 1) {
                printAllCats(catsArray);

            } else if (menuNum == 2) {
                catsArray = addCat(console, catsArray);

            } else if (menuNum == 3) {
                catsArray = removeCat(console, catsArray);

            } else if (menuNum == 4) {
                bubbleSort(catsArray);

            } else if (menuNum == 0) {
                System.out.println("Спасибо за посещение нашего котомагазина!");
                System.exit(0);
            }

            System.out.print("Введите номер меню: ");
            menuNum = console.nextInt();

        }

    }

    // Сортируем массив
    public static void bubbleSort(String[] catsArray) {
        for (int j = 0; j < catsArray.length; j++) {
            for (int i = 0; i < catsArray.length - j - 1; i++) {
                if (catsArray[i].charAt(0) > catsArray[i + 1].charAt(0)) {
                    String temp = catsArray[i];
                    catsArray[i] = catsArray[i + 1];
                    catsArray[i + 1] = temp;
                }

            }
        }
        printAllCats(catsArray);
    }

    // Удаляем элементы из массива
    //Index:     0 1 2 3 4
    //catsArray: a b c d e
    //resArray:  a b d e
    private static String[] removeCat(Scanner console, String[] catsArray) {
        System.out.println("Вы удаляете кота! Штош...");
        System.out.print("Введите кота без пробелов: ");
        String inputCat = console.next();
        String[] resArray = new String[catsArray.length - 1];

        int delIndex;
        for (delIndex = 0; delIndex < catsArray.length; delIndex++) {
            if (catsArray[delIndex].equals(inputCat)) {
                break;
            }
            resArray[delIndex] = catsArray[delIndex];
        }

        for (int i = delIndex; i < resArray.length; i++) {
            resArray[i] = catsArray[i + 1];
        }
        printAllCats(resArray);
        return resArray;

    }

    // Добавляем элементы массива
    private static String[] addCat(Scanner console, String[] catsArray) {
        System.out.println("Вы добавляете кота");
        System.out.print("Введите кота без пробелов: ");
        String inputCat = console.next();
        String[] resArray = new String[catsArray.length + 1];
        for (int i = 0; i < catsArray.length; i++) {
            resArray[i] = catsArray[i];
        }
        resArray[catsArray.length] = inputCat;
        printAllCats(resArray);
        return resArray;
    }

    // Печать массива с котами
    public static void printAllCats(String[] catsArray) {
        System.out.println("Итого у нас " + catsArray.length + " котов:");
        for (int i = 0; i < catsArray.length; i++) {
            System.out.println("    " + (i + 1) + ". " + catsArray[i] + " ");
        }
        System.out.println();
    }

    // Вывод меню
    public static void printMenu() {
        System.out.println("Меню:\n" + "1. Вывести всех котов ^^ ^^ ^^\n" + "2. Добавить кота =^_^=\n" + "3. Удалить кота =Т_Т=\n" + "4. Отсортировать котов :З\n" + "0. Выход -_-");
    }
}

// Меню:
// 1. Вывести всех котов ^^ ^^ ^^
// 2. Добавить кота =^_^=
// 3. Удалить кота =Т_Т=
// 4. Отсортировать котов :З
// 0. Выход -_-