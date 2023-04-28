package ru.itsjava.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Указываем два обязательных параметра для аннотации
@Target(ElementType.TYPE) // для классов и аннотаций
@Retention(RetentionPolicy.RUNTIME) // доступен в JVM
public @interface MyAnnotation {
    String message();
    boolean flag();
}
