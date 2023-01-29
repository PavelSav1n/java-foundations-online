package ru.itsjava.homeWork.interfaces.homeWork9Interfaces;

public class Dog implements Runnable, Swimmable, Walkable {
//    @Override
//    public String flyMaxDistance() {
//        return "Dogs usually don't fly. But if you take them on a plane...";
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("Nope, don't want to.");
//    }

    @Override
    public int maxRunDistance() {
        return 1000;
    }

    @Override
    public void run() {
        System.out.println("Woof woof, I'm running!");
    }

    @Override
    public double maxSwimSpeed() {
        return 5.0;
    }

    @Override
    public void swim() {
        System.out.println("Woof woof, I'm swimming!");

    }

    @Override
    public void walk() {
        System.out.println("Woof woof, like walking!");
    }
}
