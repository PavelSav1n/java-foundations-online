package ru.itsjava.homeWork.enums;

// Перечисление. Набор объектов
public enum Weekdays {
    ПОНЕДЕЛЬНИК("monday"), ВТОРНИК("tuesday"), СРЕДА("wednesday"),
    ЧЕТВЕРГ("thursday"), ПЯТНИЦА("friday"), СУББОТА("saturday"), ВОСКРЕСЕНЬЕ("sunday");

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
