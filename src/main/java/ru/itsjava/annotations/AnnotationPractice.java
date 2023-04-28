package ru.itsjava.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class AnnotationPractice {
    @SneakyThrows
    public static void main(String[] args) {

        // РЕФЛЕКСИЯ
        // 1 способ обращение к классу через экземпляр объекта:
        Person ivan = new Person("Ivan", true);
        System.out.println("ivan = " + ivan);

        // getClass -- получить класс обращаясь к нему через экземпляр этого класса
        Class<? extends Person> ivanClass = ivan.getClass();

        // getName -- теперь у класса можно получить названия этого класса
        System.out.println("ivanClass.getName() = " + ivanClass.getName());

        // 2 способ обращения к классу напрямую по названию:
        Class<?> personClass = Class.forName("ru.itsjava.annotations.Person");
        System.out.println("aClass.getName() = " + personClass.getName()); // собственно всё логично, указали имя, получили имя.

        Constructor<?> constructor = personClass.getConstructor(String.class, Boolean.TYPE); // getConstructor() -- можно через имя класса получить конструктор этого класса с определёнными параметрами
        Object objectVanya = constructor.newInstance("Vanya", true); // newInstance() -- можно воспользоваться конструктором и создать экземпляр этого класса как некий объект
        Person personVanya = (Person) objectVanya; // можно привести этот объект к необходимому нам типу Person

        // три строки выше можно заменить на одну:
        Person petr = (Person) personClass.getConstructor(String.class, Boolean.TYPE).newInstance("Petr", false);

        System.out.println("objectVanya = " + objectVanya); // обычный объект
        System.out.println("personVanya = " + personVanya); // Person объект

        // getAnnotations() -- можно получить RUNTIME аннотацию.
        System.out.println("personClass.getAnnotations()[0] = " + personClass.getAnnotations()[0]);


        Field isGoodField = personClass.getDeclaredField("isGood"); // getDeclaredField() -- получить доступ к указанному полю
        isGoodField.setAccessible(true); // setAccessible() -- поскольку поле private, необходимо изменить его доступность на true
        isGoodField.setBoolean(objectVanya, false); // setBoolean -- можно изменить у экземпляра любое поле
        isGoodField.setBoolean(personVanya, false);
        isGoodField.setBoolean(petr, true);

        System.out.println("objectVanya = " + objectVanya);
        System.out.println("personVanya = " + personVanya);
        System.out.println("petr = " + petr);


    }
}
