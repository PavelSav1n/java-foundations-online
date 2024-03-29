package ru.itsjava.homeWork.threads.volatileBaeldung;

public class TaskRunner {

    private volatile static int number;
    private volatile static boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                System.out.println("reader running");
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Reader().start();

        // Well, when the main thread updates the number and ready variables,
        // there’s no guarantee about what the reader thread may see. In other words,
        // the reader thread may immediately see the updated value, with some delay, or never at all
        // I cannot catch this moment though.
        // Just have to believe this words.
        
        number = 2;
        number += number; // 4
        number += number; // 8
        number += number; // 16

        number += number; // 32
        ready = true;
        Thread.sleep(100);

        number += number; // 64
        number += number; // 128
    }
}