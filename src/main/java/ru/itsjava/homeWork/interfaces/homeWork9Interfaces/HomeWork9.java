package ru.itsjava.homeWork.interfaces.homeWork9Interfaces;

public class HomeWork9 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Man man = new Man();

        System.out.println("Bird");
        bird.walk();
        bird.fly();
        bird.run();
        bird.swim();
        System.out.println("bird.flyMaxDistance() = " + bird.flyMaxDistance());
        System.out.println("bird.maxRunDistance() = " + bird.maxRunDistance());
        System.out.println("bird.maxSwimSpeed() = " + bird.maxSwimSpeed());

        System.out.println("");
        System.out.println("Cat");
        cat.walk();
        //cat.fly();
        cat.run();
        cat.swim();
        //System.out.println("cat.flyMaxDistance() = " + cat.flyMaxDistance());
        System.out.println("cat.maxRunDistance() = " + cat.maxRunDistance());
        System.out.println("cat.maxSwimSpeed() = " + cat.maxSwimSpeed());

        System.out.println("");
        System.out.println("Dog");
        dog.walk();
        //dog.fly();
        dog.run();
        dog.swim();
        // System.out.println("dog.flyMaxDistance() = " + dog.flyMaxDistance());
        System.out.println("dog.maxRunDistance() = " + dog.maxRunDistance());
        System.out.println("dog.maxSwimSpeed() = " + dog.maxSwimSpeed());

        System.out.println("");
        System.out.println("Fish");
        //fish.walk();
        fish.fly();
        //fish.run();
        fish.swim();
        System.out.println("fish.flyMaxDistance() = " + fish.flyMaxDistance());
        //System.out.println("fish.maxRunDistance() = " + fish.maxRunDistance());
        System.out.println("fish.maxSwimSpeed() = " + fish.maxSwimSpeed());

        System.out.println("");
        System.out.println("Man");
        man.walk();
        //man.fly();
        man.run();
        man.swim();
        //System.out.println("man.flyMaxDistance() = " + man.flyMaxDistance());
        System.out.println("man.maxRunDistance() = " + man.maxRunDistance());
        System.out.println("man.maxSwimSpeed() = " + man.maxSwimSpeed());

    }
}
