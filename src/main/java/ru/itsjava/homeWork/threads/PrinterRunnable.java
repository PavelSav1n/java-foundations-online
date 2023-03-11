package ru.itsjava.homeWork.threads;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterRunnable implements Runnable {
    private final String message;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; true; i++) {
            Thread.sleep(delay);
            System.out.print(i + " " + message + " | ");
        }
    }
}
