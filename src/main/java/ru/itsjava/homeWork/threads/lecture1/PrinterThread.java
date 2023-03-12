package ru.itsjava.homeWork.threads.lecture1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterThread extends Thread {
    private final String message;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(500L);
        for (int i = 0; true; i++) {
            Thread.sleep(delay);
            System.out.print(i + " " + message + " | ");
        }
    }
}
