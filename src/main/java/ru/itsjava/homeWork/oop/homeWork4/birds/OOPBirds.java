package ru.itsjava.homeWork.oop.homeWork4.birds;

public class OOPBirds {
    public static void main(String[] args) {
        Bird parrot1 = new Parrot("Male", false, 5);
        Bird parrot2 = new Parrot("Female", true, 49);
        Bird crow1 = new Crow("Female", false, 15);
        Bird crow2 = new Crow("Male", true, 19);
        Bird randomBird = new Bird("JustABird");

        System.out.println("**********");
        System.out.println("Print Info");
        System.out.println("**********");
        parrot1.printInfo();
        parrot2.printInfo();
        crow1.printInfo();
        crow2.printInfo();
        randomBird.printInfo();

        System.out.println("******");
        System.out.println("Squawk");
        System.out.println("******");
        System.out.print("parrot1: ");
        parrot1.squawk();
        System.out.print("crow1: ");
        crow1.squawk();
        System.out.print("randomBird: ");
        randomBird.squawk();

    }

}
