package ru.itsjava.annotations.junit.myannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
// Запускает метод, помеченный этой аннотацией после каждого теста
public @interface After {
}
