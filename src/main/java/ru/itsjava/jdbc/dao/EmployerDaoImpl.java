package ru.itsjava.jdbc.dao;

import java.sql.*;

public class EmployerDaoImpl implements EmployerDao {

    // 1. URL, login, psw к БД
    private static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone=UTC";


    @Override
    public int findAgeByName(String name) {
        // 3. Используем JDBC
        // С помощью try with resources
        // 1. создаём соединение с нашими данными по БД (connection)
        // 2. через это соединение создаём некий запрос к БД (statement)
        // Все эти классы имплементируют AutoCloseable
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             Statement statement = connection.createStatement()) {
            // Внутри блока try: пытаемся выполнить этот запрос и передаём в качестве параметра сам запрос
            // 1. Создаём переменную типа ResultSet (интерфейс)
            // 2. Кладём в неё результат работы executeQuery(), который возвращает один объект типа ResultSet object.
            // ПРИМЕЧАНИЕ: В коде стараться избегать SELECT * -- всегда конкретизируем, что мы выбираем.
            ResultSet resultSet = statement.executeQuery("SELECT age FROM schema_online_course.employers " +
                    "where name = '" + name + "';");

            // Изначально resultSet не содержит строки, поэтому для работы со строкой необходимо хотя бы один раз вызывать метод next()
            resultSet.next();
            return resultSet.getInt("age");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Если try/catch зафейлил метод возвращает -1. Но до сюда никогда не дойдём, потому что прокинули исключение.
        return -1;
    }

    @Override
    public int findAgeByNamePreparedStatement(String name) {
        // 3. Используем JDBC
        // С помощью try with resources
        // 1. создаём соединение с нашими данными по БД (connection)
        // 2. через это соединение создаём некий запрос к БД (preparedStatement)
        // Особенность этого preparedStatement, что мы можем передавать в тело запроса параметры
        // Все эти классы имплементируют AutoCloseable
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             // Помещаем в метод prepareStatement() в качестве параметра запрос, где вместо изменяемых параметров знаки "?"
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT age FROM schema_online_course.employers where name = ?;")) {
            // Присваиваем значения знакам "?" по порядку:
            preparedStatement.setString(1, name);
            // Выполняем запрос уже без передачи туда самого SQL запроса
            ResultSet resultSet = preparedStatement.executeQuery();
            // Изначально resultSet не содержит строки, поэтому для работы со строкой необходимо хотя бы один раз вызывать метод next()
            resultSet.next();
            return resultSet.getInt("age");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Если try/catch зафейлил метод возвращает -1. Но до сюда никогда не дойдём, потому что прокинули исключение.
        return -1;
    }
}