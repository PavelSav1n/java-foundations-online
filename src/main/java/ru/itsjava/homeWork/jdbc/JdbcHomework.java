package ru.itsjava.homeWork.jdbc;

import ru.itsjava.homeWork.jdbc.dao.UserDao;
import ru.itsjava.homeWork.jdbc.dao.UserDaoImpl;

public class JdbcHomework {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();
        System.out.println("userDao.getAgeByUserName(\"Misha\") = " + userDao.getAgeByUserName("Misha"));
    }
}