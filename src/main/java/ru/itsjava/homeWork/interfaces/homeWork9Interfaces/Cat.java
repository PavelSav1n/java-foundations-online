package ru.itsjava.homeWork.interfaces.homeWork9Interfaces;

public class Cat implements Runnable, Flyable, Swimmable, Walkable{
    @Override
    public String flyMaxDistance() {
        return "Cats usually don't fly. But if you take them on a plane...";
    }

    @Override
    public void fly() {
        System.out.println("Nope, don't want to fly right meow.");

    }

    @Override
    public int maxRunDistance() {
        return 500;
    }

    @Override
    public void run() {
        System.out.println("Vigorously running around the room");

    }

    @Override
    public double maxSwimSpeed() {
        return 5;
    }

    @Override
    public void swim() {
        System.out.println("I'm a cat, I hate swimming!");

    }

    @Override
    public void walk() {
        System.out.println("Meow, I'm walking around. But not too long.");

    }
}
