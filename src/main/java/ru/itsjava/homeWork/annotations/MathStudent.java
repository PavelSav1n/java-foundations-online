package ru.itsjava.homeWork.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Department(departmentName = "Mathematics")
public class MathStudent {
    private final String name;
    private final String surname;
    private int course;
}
