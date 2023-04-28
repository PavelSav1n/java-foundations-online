package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@MyAnnotation(message =  "message field of annotation", flag = true)
@AllArgsConstructor
@ToString
public class Person {
    private final String name;
    private boolean isGood;
}
