package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.EmployerDao;
import ru.itsjava.jdbc.dao.EmployerDaoImpl;

import java.sql.*;

public class JdbcPractice {

//    // 1. URL, login, psw к БД
//    private static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone=UTC";
//    private static final String DB_LOGIN = "root";
//    private static final String DB_PASSWORD = "root";

    // 2. Драйвер в зависимостях
    // идём в https://mvnrepository.com/repos/central
    // mysql-connector ->
    // https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.0.32
    // прописываем зависимости в pom.xml

    public static void main(String[] args) {
//        // 3. Используем JDBC
//        // С помощью try with resources
//        // 1. создаём соединение с нашими данными по БД (connection)
//        // 2. через это соединение создаём некий запрос к БД (statement)
//        // Все эти классы имплементируют AutoCloseable
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()) {
//            // Внутри блока try: пытаемся выполнить этот запрос и передаём в качестве параметра сам запрос
//            // 1. Создаём переменную типа ResultSet (интерфейс)
//            // 2. Кладём в неё результат работы executeQuery(), который возвращает один объект типа ResultSet object.
//            // ПРИМЕЧАНИЕ: В коде стараться избегать SELECT * -- всегда конкретизируем, что мы выбираем.
//            ResultSet resultSet = statement.executeQuery("SELECT name, age FROM schema_online_course.users");
//
//            // Изначально resultSet не содержит строки, поэтому для работы со строкой необходимо хотя бы один раз вызывать метод next()
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name") + ":" + resultSet.getInt("age"));
//                System.out.println(resultSet);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


        // Создаём свой DAO класс для работы с базой данных:
        EmployerDao dao = new EmployerDaoImpl();

        System.out.println("dao.findAgeByName(Вова) = " + dao.findAgeByName("Вова"));

        System.out.println("dao.findAgeByNamePreparedStatement(\"Таня\") = " + dao.findAgeByNamePreparedStatement("Таня"));

    }
}

// Написать свой DAO