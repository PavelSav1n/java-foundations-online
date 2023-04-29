package ru.itsjava.annotations.junit.myannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
// Передаёт в строке название теста на русском языке и вывести это название перед началом теста
public @interface DisplayName {
    String name();
}
