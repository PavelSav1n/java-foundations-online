package ru.itsjava.homeWork.exceptions.homeWork13;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws AgeNotValidException {
        this.name = name;
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Возраст меньше нуля или больше 150");
        } else {
            this.age = age;
        }
    }
}
