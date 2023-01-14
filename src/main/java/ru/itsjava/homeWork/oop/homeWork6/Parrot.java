package ru.itsjava.homeWork.oop.homeWork6;

public class Parrot extends Bird {
    // Fields

    // Constructor
    public Parrot(String gender, boolean isDomestic, int age) {
        super("Parrot", gender, isDomestic, age);
    }
    // Methods

    @Override
    public void squawk(){
        System.out.println("chirp! *whistle* purr!");
    }
}
