package ru.itsjava.homeWork.oop.homeWork4.birds;


public class Crow extends Bird {
    // Fields

    // Constructor
    public Crow(String gender, boolean isDomestic, int age) {
        super("Crow", gender, isDomestic, age);
    }
    // Methods
    @Override
    public void squawk(){
        System.out.println("kraaa!");
    }
}
