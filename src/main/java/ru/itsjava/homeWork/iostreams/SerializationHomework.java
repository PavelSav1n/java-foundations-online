package ru.itsjava.homeWork.iostreams;

import java.io.*;

public class SerializationHomework {
    public static void main(String[] args) {

        // Создаём экземпляр объекта User для сериализации:
        User egor = new User("Egor", "eg0r");

        // Сериализуем в файл:
        // try/catch -> инициализируем новый поток ObjectOutputStream и указываем файл, куда будет производиться запись
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/SerializationHomework.out"))) {
            // пишем поток объекта egor
            outputStream.writeObject(egor);
            // ловим исключения:
        } catch (IOException e) {
            e.printStackTrace();
        }

        //*****************************************************

        // Десериализуем файл:
        // try/catch -> инициализируем новый поток ObjectInputStream и указываем файл, откуда будет производиться чтение
//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/SerializationHomework.out"))) {
//
//            // Создаём объект и записываем туда то что прочитали из потока:
//            Object obj = inputStream.readObject();
//            // Явно приводим к нужному нам объекту:
//            User egorFromInput = (User) obj;
//            System.out.println("egorFromInput = " + egorFromInput);
//
//        // Обрабатываем исключения:
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
    }
}
