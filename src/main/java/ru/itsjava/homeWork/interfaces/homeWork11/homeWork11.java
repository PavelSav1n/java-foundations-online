package ru.itsjava.homeWork.interfaces.homeWork11;

public class homeWork11 {
    public static void main(String[] args) {
        Eatable cow = new Cow();
        Cow cow2 = new Cow();
        Man man = new Man();
        Plant plant = new Plant();

        System.out.print("Eatable cow.eat() = ");
        cow.eat();
        System.out.println("Eatable cow.talk() is not available due to link type of this object ");
        System.out.print("Cow cow2.talk() = ");
        cow2.talk();
        System.out.print("Cow cow2.eat() = ");
        cow2.eat();
        System.out.print("Man man.talk() = ");
        man.talk();
        System.out.print("Plant plant.eat() = ");
        plant.eat();
    }
}
