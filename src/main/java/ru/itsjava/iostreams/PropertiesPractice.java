package ru.itsjava.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) throws IOException {
        // При компиляции и собирании программы в jar, указанный путь не будет доступен:
        File file = new File("src/main/resources/application.properties");

        Properties props = new Properties();
        props.load(new FileInputStream(file));

        System.out.println("props.getProperty(\"key1\") = " + props.getProperty("key1"));

        props.setProperty("key2", "value2");

        System.out.println("props.getProperty(\"key2\") = " + props.getProperty("key2"));

        // CTRL + ALT + V -- создание переменной
        // Доступ к файлам в папке resources без относительных ссылок через метод ClassLoader.getResourceAsStream("filename")
        // Для этого создаём ClassLoader
        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        // Создаём входящий поток, который будет читать файл с указанным именем из resources:
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");

        // Создаём класс Properties для обработки нашего потока:
        // По сути Properties это наследник Hashtable<Object, Object> который реализует интерфейс Map<K,V>
        Properties propsFromStream = new Properties();

        // Читаем поток:
        propsFromStream.load(inputStream);

        System.out.println("propsFromStream.getProperty(\"key1\") = " + propsFromStream.getProperty("key1"));
    }
}
