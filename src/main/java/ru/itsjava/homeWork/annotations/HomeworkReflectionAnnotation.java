package ru.itsjava.homeWork.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class HomeworkReflectionAnnotation {
    @SneakyThrows
    public static void main(String[] args) {


        // 1 способ -- рефлексия через экземпляр объекта:
        MathStudent ivanPetrov = new MathStudent("Ivan", "Petrov", 1);
        System.out.println("ivanPetrov before reflection change = " + ivanPetrov);
        Field nameField = ivanPetrov.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(ivanPetrov, "Petr");
        System.out.println("ivanPetrov after = " + ivanPetrov);

        // 2 способ -- рефлексия через прямое название класса:
        Class<?> biologyStudentClass = Class.forName("ru.itsjava.homeWork.annotations.BiologyStudent");
        BiologyStudent annaPetrova = (BiologyStudent) biologyStudentClass.getConstructor(String.class, String.class, Integer.TYPE).newInstance("Anna", "Petrova", 2);

        System.out.println("annaPetrova = " + annaPetrova);

        // Смотрим аннотацию:
        // у класса:
        System.out.println("biologyStudentClass.getAnnotations()[0] = " + biologyStudentClass.getAnnotations()[0]);
        // у объекта класса:
        System.out.println("annaPetrova.getClass().getAnnotations()[0] = " + ivanPetrov.getClass().getAnnotations()[0]);

    }
}
