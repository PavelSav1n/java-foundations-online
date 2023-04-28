package ru.itsjava.homeWork.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Department(departmentName = "Biology")
public class BiologyStudent {
    private final String name;
    private final String surname;
    private int course;
}
