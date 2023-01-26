package ru.itsjava.homeWork.oop.homeWork7Testing;

import lombok.AllArgsConstructor;
import lombok.Data;

// Все сеттеры, геттеры, хешкод и equals, toString() + @RequiredArgsConstructor(конструктор со всеми final и @NonNull полями)
@Data
// Конструктор со всеми полями
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    // Увеличиваем возраст на 1
    public void birthday() {
        setAge(++age);
    }

    // Проверка возраста на 18
    public boolean takeBeer() {
        return age > 18;
    }
}
