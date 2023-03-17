package ru.itsjava.jdbc.dao;

public interface EmployerDao {
    int findAgeByName(String name);

    int findAgeByNamePreparedStatement(String name);


}