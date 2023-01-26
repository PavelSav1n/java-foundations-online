package ru.itsjava.homeWork.interfaces.homeWork9Interfaces;

public class Fish implements Runnable, Flyable, Swimmable, Walkable {
    @Override
    public String flyMaxDistance() {
        return "About 30 sm if it is an ordinary fish, and about 50 metres if it's a flying fish";
    }

    @Override
    public void fly() {
        System.out.println("Wheee, i'm flying! ... Splash!");

    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void run() {
        System.out.println("I'm a fish. I cannot run.");

    }

    @Override
    public double maxSwimSpeed() {
        return 50.0;
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming like a fish in a water! Well, I am a fish.");

    }

    @Override
    public void walk() {
        System.out.println("I'm a fish. I cannot walk, sorry.");
    }
}
