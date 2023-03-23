package ru.itsjava.homeWork.enums;

// Перечисление. Набор объектов
public enum Weekdays {
    MONDAY("ПОНЕДЕЛЬНИК"), TUESDAY("ВТОРНИК"), WEDNESDAY("СРЕДА"),
    THURSDAY("ЧЕТВЕРГ"), FRIDAY("ПЯТНИЦА"), SATURDAY("СУББОТА"), SUNDAY("ВОСКРЕСЕНЬЕ");

    private final String translation;

    // Конструктор для дополнительных полей.
    // private by default
    Weekdays(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Weekdays{" + this.name() +
                " (translation='" + translation + '\'' + ")}";
    }
}
