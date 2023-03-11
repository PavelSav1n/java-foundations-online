package ru.itsjava.homeWork.iostreams;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHomework {

    public static void main(String[] args) throws IOException {

        // Для загрузки файла без относительной ссылки не файл создаём ClassLoader
        ClassLoader classLoader = PropertiesHomework.class.getClassLoader();
        // После чего в этом ClassLoader вызываем метод getResourceAsStream и указываем, какой файл нам нужно считать и пихаем в переменную inputStream
        InputStream inputStream = classLoader.getResourceAsStream("app.properties");
        // Создаём характеристики для загрузки туда наших настроек:
        Properties propsFromStream = new Properties();
        // Загружаем в характеристики настройки:
        propsFromStream.load(inputStream);

        // Вывод на экран загруженных характеристик
        System.out.println("propsFromStream.getProperty(name) = " + propsFromStream.getProperty("name"));
        System.out.println("propsFromStream.getProperty(nickname) = " + propsFromStream.getProperty("nickname"));

    }
}
