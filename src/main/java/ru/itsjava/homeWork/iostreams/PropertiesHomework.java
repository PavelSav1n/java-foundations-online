package ru.itsjava.homeWork.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHomework {

    public static void main(String[] args) throws IOException {

        // Для загрузки файла без относительной ссылки на файл создаём ClassLoader
        ClassLoader classLoader = PropertiesHomework.class.getClassLoader();
        // После чего в этом ClassLoader вызываем метод getResourceAsStream и указываем, какой файл нам нужно считать и пихаем в переменную inputStream
        InputStream inputStream = classLoader.getResourceAsStream("app.properties");
        // ClassLoader тут используется исключительно для того, чтобы не писать путь от repository root и вот эту елду с трай/кетчем.

        // Вот так выглядит через обычный FileInputStream:
        try (FileInputStream inputStream1 = new FileInputStream("src/main/resources/app.properties")) {
            Properties propertiesFromStream1 = new Properties();
            propertiesFromStream1.load(inputStream1);
            System.out.println("propertiesFromStream1.getProperty(\"name\") = " + propertiesFromStream1.getProperty("name"));
            System.out.println("propertiesFromStream1.getProperty(\"nickname\") = " + propertiesFromStream1.getProperty("nickname"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Создаём характеристики для загрузки туда наших настроек:
        Properties propsFromStream = new Properties();
        // Загружаем в характеристики настройки:
        propsFromStream.load(inputStream);

        // Вывод на экран загруженных характеристик
        System.out.println("propsFromStream.getProperty(name) = " + propsFromStream.getProperty("name"));
        System.out.println("propsFromStream.getProperty(nickname) = " + propsFromStream.getProperty("nickname"));

    }
}
