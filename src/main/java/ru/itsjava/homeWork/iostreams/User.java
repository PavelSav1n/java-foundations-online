package ru.itsjava.homeWork.iostreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
// Устанавливаем флаг (маркер), что объект сериализуем:
public class User implements Serializable {

    private String login;
    // устанавливаем transient для поля password, чтобы исключить из сериализации объекта:
    private transient String password;

}
