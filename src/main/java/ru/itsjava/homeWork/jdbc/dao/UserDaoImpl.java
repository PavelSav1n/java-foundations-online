package ru.itsjava.homeWork.jdbc.dao;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    // 1. URL, login, psw к БД
    private static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone=UTC";


    @Override
    public int getAgeByUserName(String name) {
        // Создаём соединение и просим у DriverManager это соединение по нашему URL, login и psw
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT age FROM schema_online_course.users where name = ?;")) {
            // Присваиваем значения знакам "?" по порядку:
            preparedStatement.setString(1, "Misha");
            // Выполняем запрос уже без передачи туда самого SQL запроса
            ResultSet resultSet = preparedStatement.executeQuery();
            // Изначально resultSet не содержит строки, поэтому для работы со строкой необходимо хотя бы один раз вызывать метод next()
            resultSet.next();
            return resultSet.getInt("age");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }
}