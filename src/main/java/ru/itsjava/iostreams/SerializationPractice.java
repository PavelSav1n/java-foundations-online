package ru.itsjava.iostreams;

import ru.itsjava.collections.maps.Man;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {

        // Создаём объект, который будет сериализовать:
//        Man man = new Man("Vitalik");
//
//        // Сериализуем объект Man:
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))) {
//
//            outputStream.writeObject(man);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Десериализуем файл man.out обратно в объект:

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/man.out")
        )){
            Object obj = inputStream.readObject();
            Man man = (Man) obj;
            System.out.println("man = " + man);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
