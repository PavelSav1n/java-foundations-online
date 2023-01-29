package ru.itsjava.homeWork.interfaces.homeWork9Interfaces;

public class Man implements Runnable, Swimmable, Walkable {
//    @Override
//    public String flyMaxDistance() {
//        return "Limitless, eternity is not a limit!";
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("Time to take a plane!");
//    }

    @Override
    public int maxRunDistance() {
        return 1000;
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public double maxSwimSpeed() {
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Swims");
    }

    @Override
    public void walk() {
        System.out.println("OK, lets take a walk");
    }
}
