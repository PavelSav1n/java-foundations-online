package ru.itsjava.homeWork.threads;

import java.util.Scanner;

public class ThreadHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое сообщение, которое будет повторяться: ");
        String message1 = scanner.next();
        System.out.print("Введите задержку в миллисекундах: ");
        long delay1 = scanner.nextLong();
        System.out.print("Введите первое сообщение, которое будет повторяться: ");
        String message2 = scanner.next();
        System.out.print("Введите задержку в миллисекундах: ");
        long delay2 = scanner.nextLong();

        // Класс для потока через интерфейс:
        PrinterRunnable printerRunnable = new PrinterRunnable(message1, delay1);
        // Поток через наследование Thread
        PrinterThread printerThread = new PrinterThread(message2, delay2);
        // Создаём поток и указываем класс, который должен быть выполнен потоком
        Thread threadMessage1 = new Thread(printerRunnable);

        threadMessage1.start();
        printerThread.start();


    }
}
