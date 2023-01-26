package ru.itsjava.homeWork.interfaces.homeWork9Interfaces;

public class Bird implements Runnable, Flyable, Swimmable, Walkable {
    @Override
    public String flyMaxDistance() {
        return "About 10k km" ;
    }

    @Override
    public void fly() {
        System.out.println("Chirp, like flying!");

    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void run() {
        System.out.println("Chirp, I can run. Especially if I am a ostrich");
    }

    @Override
    public double maxSwimSpeed() {
        return 25;
    }

    @Override
    public void swim() {
        System.out.println("Chirp, I hope I'm a penguin!");

    }

    @Override
    public void walk() {
        System.out.println("Chirp, OK, let's have a walk!");

    }
}

