package ru.itsjava.threads.lecture1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

// Преимущество реализации интерфейса состоит в том, что этот клас может наследоваться от других классов без ограничения,
// тогда как наследование от Thread ограничивает рамками наследования от этого класса.
@AllArgsConstructor
public class PrinterThread extends Thread {
    private final String message;
    private final long delay;

    // добавляет текущему классу throwable
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(delay);
            System.out.print(message + " ");
        }
    }
}