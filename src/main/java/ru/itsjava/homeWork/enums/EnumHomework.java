package ru.itsjava.homeWork.enums;

import java.util.ArrayList;

public class EnumHomework {
    public static void main(String[] args) {

        // Массив заполняется значениями из перечисления с помощью .values()
        Weekdays[] weekdaysArray = Weekdays.values();

        for (Weekdays weekElem : weekdaysArray) {
            System.out.println(weekElem);
        }

    }
}
