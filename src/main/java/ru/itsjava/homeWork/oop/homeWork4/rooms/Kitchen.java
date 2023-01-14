package ru.itsjava.homeWork.oop.homeWork4.rooms;

public class Kitchen extends Room {
    // Fields

    // Constructor
    public Kitchen(int width, int length, int height, int wattLimit) {
        super(width, length, height, false, wattLimit);
    }

    // Methods
    public void hoodSwitch (){
        System.out.println("*This is Kitchen hood switch*");
    }

}
