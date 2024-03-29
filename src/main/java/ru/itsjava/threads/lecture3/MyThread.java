package ru.itsjava.threads.lecture3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyThread extends Thread {

    private final int num;
    private final ThreadPractice threadPractice;

    @Override
    public void run() {
        System.out.println("Starting run");
        threadPractice.printNum(num); // This is synchronized method;
        System.out.println("Finishing run");
    }
}
